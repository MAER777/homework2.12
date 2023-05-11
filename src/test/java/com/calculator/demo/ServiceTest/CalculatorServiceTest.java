package com.calculator.demo.ServiceTest;

import com.calculator.demo.Exсeption.MyIllegalArgumentException;
import com.calculator.demo.Service.CalculatorServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CalculatorServiceTest {
    private int n1;
    private int n2;
    private int n3;
    private int n4;
    private int zero;
    private CalculatorServiceImpl calculatorService;

    @BeforeEach
    public void setUp() {
        n1 = 1;
        n2 = 10;
        n3 = -10;
        n4 = -2;
        zero = 0;
        calculatorService = new CalculatorServiceImpl();
    }
    @Test
    public void plusTwoPositiveNumber() {
        int plus = calculatorService.plus(n1, n2);
        assertEquals(11,plus);
        System.out.println(plus);
    }

    @Test
    public void plusTwoNegativeNumber() {
        int plus = calculatorService.plus(n3, n4);
        assertEquals(-12,plus);
        System.out.println(plus);
    }

    @Test
    public void minusTwoPositiveNumber() {
        int plus = calculatorService.minus(n1, n2);
        assertEquals(-9,plus);
        System.out.println(plus);
    }

    @Test
    public void minusTwoNegativeNumber() {
        int plus = calculatorService.minus(n3, n4);
        assertEquals(-8,plus);
        System.out.println(plus);
    }

    @Test
    public void multiplyTwoPositiveNumber() {
        int plus = calculatorService.multiply(n1, n2);
        assertEquals(10,plus);
        System.out.println(plus);
    }

    @Test
    public void multiplyTwoNegativeNumber() {
        int plus = calculatorService.multiply(n3, n4);
        assertEquals(20,plus);
        System.out.println(plus);
    }

    @Test
    public void divideTwoPositiveNumber() {
        int plus = calculatorService.divide(n1, n2);
        assertEquals(0,plus);
        System.out.println(plus);
    }

    @Test
    public void divideTwoNegativeNumber() {
        int plus = calculatorService.divide(n3, n4);
        assertEquals(5,plus);
        System.out.println(plus);
    }

    @Test
    public void divideZero() {
        assertThrows(MyIllegalArgumentException.class, () -> calculatorService.divide(n1, zero));
    }
}
