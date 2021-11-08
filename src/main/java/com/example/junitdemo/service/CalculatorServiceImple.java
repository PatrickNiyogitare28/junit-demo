package com.example.junitdemo.service;

import com.example.junitdemo.interfaces.CalculatorService;

public class CalculatorServiceImple {
    CalculatorService calculatorService;

    public void setData(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }

    public int calculate(){
        int sum = 0;
        for (int value : calculatorService.getAll()) {
            sum += value;
        }
        return sum;
    }
}
