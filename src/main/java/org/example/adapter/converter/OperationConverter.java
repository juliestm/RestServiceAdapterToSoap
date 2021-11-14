package org.example.adapter.converter;

import org.example.adapter.model.AddOperation;
import org.example.adapter.model.DivideOperation;
import org.example.adapter.model.MultiplyOperation;
import org.example.adapter.model.SubtractOperation;
import org.springframework.stereotype.Component;

@Component
public class OperationConverter {
    public AddOperation toAddOperation (Integer intA, Integer intB) {
        AddOperation addOperation = new AddOperation();
        addOperation.setIntA(intA);
        addOperation.setIntB(intB);
        return addOperation;
    }

    public SubtractOperation toSubtractOperation (Integer intA, Integer intB) {
        SubtractOperation subtractOperation = new SubtractOperation();
        subtractOperation.setIntA(intA);
        subtractOperation.setIntB(intB);
        return subtractOperation;
    }

    public MultiplyOperation toMultiplyOperation (Integer intA, Integer intB) {
        MultiplyOperation multiplyOperation = new MultiplyOperation();
        multiplyOperation.setIntA(intA);
        multiplyOperation.setIntB(intB);
        return multiplyOperation;
    }

    public DivideOperation toDivideOperation (Integer intA, Integer intB) {
        DivideOperation divideOperation = new DivideOperation();
        divideOperation.setIntA(intA);
        divideOperation.setIntB(intB);
        return divideOperation;
    }

}
