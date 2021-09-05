package com.example.springboottestapplication.service.impl;

import com.example.springboottestapplication.service.HelloRepository;
import com.example.springboottestapplication.service.HelloService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class HelloServiceUnitTest {

    private final HelloService helloService;

    @MockBean
    private HelloRepository helloRepository;

    @Autowired
    public HelloServiceUnitTest(HelloService helloService) {
        this.helloService = helloService;
    }

    @Test
    void getTest1() {
        Mockito.when(helloRepository.get()).thenReturn("Hello Repository");
        assertEquals("Hello Repository", helloService.get());
    }

    @Test
    void getTest2() {
        Mockito.when(helloRepository.get()).thenReturn("AAA");
        assertEquals("AAA", helloService.get());
    }
}
