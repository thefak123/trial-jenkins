package com.example.calculator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.calculator.services.CalculatorService;


@RestController
public class CalculatorController {
    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/sum")
    public int getMethodName(@RequestParam int a, @RequestParam int b) {
        return calculatorService.sum(a, b);
    }
    
}
