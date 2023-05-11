package com.calculator.demo.Service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class CalculatorServiceImplParamTest {
    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    public static Stream<Arguments> calServParamsForTest() {
        return Stream.of(
                Arguments.of(5,5,10),
                Arguments.of(5,-5,0),
                Arguments.of(5,0,5)
        );
    }

    public static Stream<Arguments> calMinusServParamsForTest() {
        return Stream.of(
                Arguments.of(5,5,0),
                Arguments.of(5,-5,10),
                Arguments.of(5,0,5)
        );
    }

    public static Stream<Arguments> calMultiplyServParamsForTest() {
        return Stream.of(
                Arguments.of(5,5,25),
                Arguments.of(5,-5,-25),
                Arguments.of(5,0,0)
        );
    }
    public static Stream<Arguments> calDivideServParamsForTest() {
        return Stream.of(
                Arguments.of(5,5,1),
                Arguments.of(5,-5,-1),
                Arguments.of(5,1,5)
        );
    }


    @ParameterizedTest
    @MethodSource("calServParamsForTest")
    public void plusTest(int num1, int num2, int result) {
        assertEquals(result, calculatorService.plus(num1, num2));
//        assertEquals(result, calculatorService.plus(num1,num2));
    }

    @ParameterizedTest
    @MethodSource("calMinusServParamsForTest")
    public void minusTest(int num1, int num2, int result) {
        assertEquals(result, calculatorService.minus(num1,num2));
    }

    @ParameterizedTest
    @MethodSource("calMultiplyServParamsForTest")
    public void multiplyTest(int num1, int num2, int result) {
        assertEquals(result, calculatorService.multiply(num1,num2));
    }
    @ParameterizedTest
    @MethodSource("calDivideServParamsForTest")
    public void divideTest(int num1, int num2, int result) {
        assertEquals(result, calculatorService.divide(num1,num2));
    }
}