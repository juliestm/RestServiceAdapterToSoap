package org.example.adapter.model;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.adapter.model.property.XmlProperties;

import javax.xml.bind.annotation.XmlRootElement;

@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@XmlRootElement(name = "Divide", namespace = XmlProperties.NAMESPACE_URI)
public class DivideOperation extends Operation {
    public DivideOperation(Integer intA, Integer intB) {
        super(intA, intB);
    }
}
