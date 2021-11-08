package com.example.junitdemo.service;


import com.example.junitdemo.interfaces.CalculatorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorServiceImplMany implements CalculatorService {
    @Override
    public int[] getAll(){
        return new int[]{1,2,3};
    }
}

class CalculatorServiceImplEmpty implements CalculatorService {
    @Override
    public int[] getAll(){
        return new int[]{};
    }
}

public class CalculatorServiceImplStubTest {
      CalculatorServiceImple calculatorServiceImple = new CalculatorServiceImple();
      @Test
      public void calculateManyData(){
          calculatorServiceImple.setData(new CalculatorServiceImplMany());

          int result = calculatorServiceImple.calculate();
          int expected = 6;
          assertEquals(result, expected);
      }

    @Test
    public void calculateEmpty(){
        calculatorServiceImple.setData(new CalculatorServiceImplEmpty());

        int result = calculatorServiceImple.calculate();
        int expected = 0;
        assertEquals(result, expected);
    }
}
