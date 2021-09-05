package com.example.springboottestapplication.service.impl;

import com.example.springboottestapplication.service.HelloRepository;
import com.example.springboottestapplication.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    private final HelloRepository helloRepository;

    @Autowired
    public HelloServiceImpl(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    @Override
    public String get() {
        return helloRepository.get();
    }
}
