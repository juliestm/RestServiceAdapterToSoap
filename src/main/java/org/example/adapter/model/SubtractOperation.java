package org.example.adapter.model;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.adapter.model.property.XmlProperties;

import javax.xml.bind.annotation.XmlRootElement;

@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@XmlRootElement(name = "Subtract", namespace = XmlProperties.NAMESPACE_URI)
public class SubtractOperation extends Operation {
    public SubtractOperation(Integer intA, Integer intB) {
        super(intA, intB);
    }
}
