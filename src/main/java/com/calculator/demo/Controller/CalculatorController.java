package com.calculator.demo.Controller;

import com.calculator.demo.Exсeption.NumberException;
import com.calculator.demo.Service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String helloCalculator() {
        return calculatorService.hello();
    }

    @GetMapping(path = "plus")
    public String plus (@RequestParam (value = "num1", required = false) Integer number1,
                        @RequestParam (value = "num2", required = false) Integer number2){
        if (number1 == null && number2 == null) {
            throw new NumberException();
        } else if (number1 == null) {
            throw new NumberException();
        } else if (number2 == null) {
            throw new NumberException();
        } else {
            return number1 + " + " + number2 + " = " + calculatorService.plus(number1, number2);
        }
    }

    @GetMapping(path = "minus")
    public String minus (@RequestParam (value = "num1", required = false) Integer number1,
                        @RequestParam (value = "num2", required = false) Integer number2){
        if (number1 == null && number2 == null) {
            throw new NumberException();
        } else if (number1 == null) {
            throw new NumberException();
        } else if (number2 == null) {
            throw new NumberException();
        } else {
            return number1 + " - " + number2 + " = " + calculatorService.minus(number1, number2);
        }
    }

    @GetMapping(path = "multiply")
    public String multiply (@RequestParam (value = "num1", required = false) Integer number1,
                         @RequestParam (value = "num2", required = false) Integer number2){
        if (number1 == null && number2 == null) {
            throw new NumberException();
        } else if (number1 == null) {
            throw new NumberException();
        } else if (number2 == null) {
            throw new NumberException();
        } else {
            return number1 + " * " + number2 + " = " + calculatorService.multiply(number1, number2);
        }
    }

    @GetMapping(path = "divide")
    public String divide (@RequestParam (value = "num1", required = false) Integer number1,
                            @RequestParam (value = "num2", required = false) Integer number2){
        if (number1 == null && number2 == null) {
            throw new NumberException();
        } else if (number1 == null) {
            if (number2 == 0) {
                throw new NumberException();
            }
            throw new NumberException();
        } else if (number2 == null) {
            throw new NumberException();
        } else {
            return number1 + " / " + number2 + " = " + calculatorService.divide(number1, number2);
        }
    }
}
