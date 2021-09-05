package com.example.springboottestapplication.controller;

import com.example.springboottestapplication.service.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/calc")
public class CalculatorController {

    private final Calculator calculator;

    @Autowired
    public CalculatorController(Calculator calculator) {
        this.calculator = calculator;
    }

    @GetMapping("/{value}")
    public int getSum(@PathVariable(name = "value") int a) {
        return calculator.sum(a);
    }
}
