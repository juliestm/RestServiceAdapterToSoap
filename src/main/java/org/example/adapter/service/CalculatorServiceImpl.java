package org.example.adapter.service;

import lombok.RequiredArgsConstructor;
import org.example.adapter.client.CalculatorSOAPClient;
import org.example.adapter.converter.OperationConverter;
import org.example.adapter.dto.ResponseDto;
import org.example.adapter.model.*;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CalculatorServiceImpl implements CalculatorService{

    private final CalculatorSOAPClient calculatorSOAPClient;
    private final OperationConverter operationConverter;

    @Override
    public ResponseDto add(Integer intA, Integer intB){
        AddOperation addOperation = operationConverter.toAddOperation(intA, intB);
        AddResult addResult = calculatorSOAPClient.add(addOperation);
        return new ResponseDto(addResult.getValue());
    }

    @Override
    public ResponseDto subtract(Integer intA, Integer intB){
        SubtractOperation subtractOperation = operationConverter.toSubtractOperation(intA, intB);
        SubtractResult subtractResult = calculatorSOAPClient.subtract(subtractOperation);
        return new ResponseDto(subtractResult.getValue());
    }

    @Override
    public ResponseDto multiply(Integer intA, Integer intB){
        MultiplyOperation multiplyOperation = operationConverter.toMultiplyOperation(intA, intB);
        MultiplyResult multiplyResult = calculatorSOAPClient.multiply(multiplyOperation);
        return new ResponseDto(multiplyResult.getValue());
    }

    @Override
    public ResponseDto divide(Integer intA, Integer intB){
        DivideOperation divideOperation = operationConverter.toDivideOperation(intA, intB);
        DivideResult divideResult = calculatorSOAPClient.divide(divideOperation);
        return new ResponseDto(divideResult.getValue());
    }

}
