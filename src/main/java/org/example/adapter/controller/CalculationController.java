package org.example.adapter.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.example.adapter.service.CalculatorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Api(value = "Адаптер для запросов к SOAP сервису: dneonline.com/calculator.asmx")
@RestController
@RequestMapping("/calculator")
@RequiredArgsConstructor
public class CalculationController {
    private final CalculatorService calculatorService;

    @GetMapping("/add")
    @ApiOperation(value = "Метод возвращает результат сложения двух чисел")
    public ResponseEntity<?> add(@RequestParam Integer intA, @RequestParam Integer intB) {
        return new ResponseEntity<>(calculatorService.add(intA, intB), HttpStatus.OK);
    }

    @GetMapping("/subtract")
    @ApiOperation(value = "Метод возвращает результат вычитания двух чисел")
    public ResponseEntity<?> subtract(@RequestParam Integer intA, @RequestParam Integer intB) {
        return new ResponseEntity<>(calculatorService.subtract(intA, intB), HttpStatus.OK);
    }

    @GetMapping("/multiply")
    @ApiOperation(value = "Метод возвращает результат умножения двух чисел")
    public ResponseEntity<?> multiply(@RequestParam Integer intA, @RequestParam Integer intB) {
        return new ResponseEntity<>(calculatorService.multiply(intA, intB), HttpStatus.OK);
    }

    @GetMapping("/divide")
    @ApiOperation(value = "Метод возвращает результат деления двух чисел")
    public ResponseEntity<?> divide(@RequestParam Integer intA, @RequestParam Integer intB) {
        if(intB == 0){
            throw new ArithmeticException("Arithmetic exception: division by zero error");
        }
        return new ResponseEntity<>(calculatorService.divide(intA, intB), HttpStatus.OK);
    }

}
