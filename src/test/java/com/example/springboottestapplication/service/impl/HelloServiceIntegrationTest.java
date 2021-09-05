package com.example.springboottestapplication.service.impl;

import com.example.springboottestapplication.service.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class HelloServiceIntegrationTest {

    private final HelloService helloService;

    @Autowired
    public HelloServiceIntegrationTest(HelloService helloService) {
        this.helloService = helloService;
    }

    @Test
    void getTest() {
        assertEquals("Hello Repository", helloService.get());
    }
}
