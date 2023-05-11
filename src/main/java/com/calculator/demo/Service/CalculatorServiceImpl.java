package com.calculator.demo.Service;

import com.calculator.demo.Exсeption.MyIllegalArgumentException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{

    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public int plus(int number1, int number2) {
        return number1 + number2;
    }

    @Override
    public int minus(int number1, int number2) {
        return number1 - number2;
    }
    @Override
    public int multiply(int number1, int number2) {
        return number1 * number2;
    }
    @Override
    public int divide(int number1, int number2) {
        if (number2 == 0) {
            throw new MyIllegalArgumentException("На ноль делить нельзя");
        }
        return number1 / number2;
    }
}
