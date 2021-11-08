package com.example.junitdemo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DaysOfWeekServiceTests {
    DaysOfWeekService daysOfWeekService = new DaysOfWeekService();
    @Test
    public void mondayCase() {
       String result = daysOfWeekService.greetings(1);
       String expectedResult = "Hello, It Monday";
       assertEquals(result, expectedResult);
    }

    @Test
    public void tueCase() {
        String result = daysOfWeekService.greetings(2);
        String expectedResult = "Hello, It Tuesday";
        assertEquals(result, expectedResult);
    }

}
