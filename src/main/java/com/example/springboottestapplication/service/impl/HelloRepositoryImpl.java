package com.example.springboottestapplication.service.impl;

import com.example.springboottestapplication.service.HelloRepository;
import org.springframework.stereotype.Service;

@Service
public class HelloRepositoryImpl implements HelloRepository {
    @Override
    public String get() {
        return "Hello Repository";
    }
}
