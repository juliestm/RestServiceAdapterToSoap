package org.example.adapter.model;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {
    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.adapter.model
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddOperation }
     *
     */
    public AddOperation createAdd() {
        return new AddOperation();
    }

    /**
     * Create an instance of {@link AddResult }
     *
     */
    public AddResult createAddResponse() {
        return new AddResult();
    }

    /**
     * Create an instance of {@link SubtractOperation }
     *
     */
    public SubtractOperation createSubtract() {
        return new SubtractOperation();
    }

    /**
     * Create an instance of {@link SubtractResult }
     *
     */
    public SubtractResult createSubtractResponse() {
        return new SubtractResult();
    }

    /**
     * Create an instance of {@link MultiplyOperation }
     *
     */
    public MultiplyOperation createMultiply() {
        return new MultiplyOperation();
    }

    /**
     * Create an instance of {@link MultiplyResult }
     *
     */
    public MultiplyResult createMultiplyResponse() {
        return new MultiplyResult();
    }

    /**
     * Create an instance of {@link DivideOperation }
     *
     */
    public DivideOperation createDivide() {
        return new DivideOperation();
    }

    /**
     * Create an instance of {@link DivideResult }
     *
     */
    public DivideResult createDivideResponse() {
        return new DivideResult();
    }

}
