package com.example.springboottestapplication.service.impl;

import com.example.springboottestapplication.service.Calculator;
import org.springframework.stereotype.Service;

@Service
public class CalculatorImpl implements Calculator {

    @Override
    public int sum(int a) {
        return 5 + a;
    }
}
