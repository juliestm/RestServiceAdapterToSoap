package org.example.adapter.service;

import org.example.adapter.dto.ResponseDto;

public interface CalculatorService {
    ResponseDto add(Integer intA, Integer intB);
    ResponseDto subtract(Integer intA, Integer intB);
    ResponseDto multiply(Integer intA, Integer intB);
    ResponseDto divide(Integer intA, Integer intB);
}
