package org.example.adapter.service;

import org.example.adapter.Application;
import org.example.adapter.dto.ResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = Application.class)
class CalculatorServiceTest {

    @Autowired
    private CalculatorService calculatorService;

    @Test
    void add() {
        ResponseDto responseDto = new ResponseDto(6);
        assertEquals(responseDto, calculatorService.add(1, 5));
    }

    @Test
    void subtract() {
        ResponseDto responseDto = new ResponseDto(-4);
        assertEquals(responseDto, calculatorService.subtract(1, 5));
    }

    @Test
    void multiply() {
        ResponseDto responseDto = new ResponseDto(5);
        assertEquals(responseDto, calculatorService.multiply(1, 5));
    }

    @Test
    void divide() {
        ResponseDto responseDto = new ResponseDto(0);
        assertEquals(responseDto, calculatorService.divide(1, 5));
    }
}