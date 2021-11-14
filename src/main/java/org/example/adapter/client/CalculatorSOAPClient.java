package org.example.adapter.client;

import org.example.adapter.model.*;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;


public class CalculatorSOAPClient extends WebServiceGatewaySupport {
    private static final String URI = "http://www.dneonline.com/calculator.asmx";
    private final Map<Class<? extends Operation>, Class<? extends Result>> operationResultClassMap = new HashMap<>();

    @PostConstruct
    private void setUp() {
        fillOperationResultClassMap();
    }

    private void fillOperationResultClassMap() {
        operationResultClassMap.put(AddOperation.class, AddResult.class);
        operationResultClassMap.put(DivideOperation.class, DivideResult.class);
        operationResultClassMap.put(MultiplyOperation.class, MultiplyResult.class);
        operationResultClassMap.put(SubtractOperation.class, SubtractResult.class);
    }

    @Cacheable("result")
    public AddResult add(AddOperation addOperation) {
        AddResult addResult = (AddResult) getWebServiceTemplate().
                marshalSendAndReceive(URI,
                        addOperation,
                        new SoapActionCallback("http://tempuri.org/Add"));
        return addResult;
    }

    @Cacheable("result")
    public SubtractResult subtract(SubtractOperation subtractOperation) {
        SubtractResult subtractResult = (SubtractResult) getWebServiceTemplate().
                marshalSendAndReceive(URI,
                        subtractOperation,
                        new SoapActionCallback("http://tempuri.org/Subtract"));
        return subtractResult;
    }

    @Cacheable("result")
    public MultiplyResult multiply(MultiplyOperation multiplyOperation) {

        MultiplyResult multiplyResult = (MultiplyResult) getWebServiceTemplate().
                marshalSendAndReceive(URI,
                        multiplyOperation,
                        new SoapActionCallback("http://tempuri.org/Multiply"));
        return multiplyResult;
    }

    @Cacheable("result")
    public DivideResult divide(DivideOperation divideOperation) {

        DivideResult divideResult = (DivideResult) getWebServiceTemplate().
                marshalSendAndReceive(URI,
                        divideOperation,
                        new SoapActionCallback("http://tempuri.org/Divide"));
        return divideResult;
    }

}
