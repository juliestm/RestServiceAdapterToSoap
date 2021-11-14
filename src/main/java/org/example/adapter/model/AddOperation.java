package org.example.adapter.model;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.adapter.model.property.XmlProperties;

import javax.xml.bind.annotation.XmlRootElement;

@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@XmlRootElement(name = "Add", namespace = XmlProperties.NAMESPACE_URI)
public class AddOperation extends Operation {
    public AddOperation(Integer intA, Integer intB) {
        super(intA, intB);
    }
}
