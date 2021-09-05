package com.example.springboottestapplication.controller;

import com.example.springboottestapplication.service.Calculator;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
@Disabled
public class CalculatorControllerUnitTest {

    @MockBean
    private Calculator calculator;

    private MockMvc mockMvc;

    @Autowired
    public CalculatorControllerUnitTest(MockMvc mockMvc) {
        this.mockMvc = mockMvc;
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void whenGetSumResult_thenSumReturn(int a) throws Exception {
        Mockito.when(calculator.sum(a)).thenReturn(5 + a);
        mockMvc.perform(get("/calc/{value}", a)
        )
                .andExpect(status().isOk())
                .andExpect(content().string(Integer.toString(5 + a)));
    }
}
