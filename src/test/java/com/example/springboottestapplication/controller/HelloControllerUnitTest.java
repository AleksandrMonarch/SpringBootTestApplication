package com.example.springboottestapplication.controller;

import com.example.springboottestapplication.service.HelloService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@WebMvcTest
@SpringBootTest
public class HelloControllerUnitTest {

    @MockBean(value = {com.example.springboottestapplication.service.HelloService.class})
    private HelloService helloService;


    private MockMvc mockMvc;

    @Autowired
    public HelloControllerUnitTest(MockMvc mockMvc) {
        this.mockMvc = mockMvc;
    }

    @Test
    void whenGetHelloData_thenDataReturn() throws Exception {
        Mockito.when(helloService.get()).thenReturn("Hello Repository");
        mockMvc.perform(get("/hello")
        )
                        .andExpect(status().isOk())
                        .andExpect(content().string("Hello Repository"));
    }
}
