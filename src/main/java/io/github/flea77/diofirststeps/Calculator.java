package io.github.flea77.diofirststeps;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public int add (int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
}
