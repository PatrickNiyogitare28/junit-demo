package com.example.junitdemo.service;

public class DaysOfWeekService {
       public String greetings(int day){
           switch(day){
               case 1:
                   return "Hello, It Monday";
               case 2:
                   return "Hello, It Tuesday";
               default:
                   return "Hello";
           }
       }
}
