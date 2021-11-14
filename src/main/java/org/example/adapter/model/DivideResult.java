package org.example.adapter.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name = "DivideResponse")
public class DivideResult extends Result {

    @XmlElement(name = "DivideResult")
    private Integer value;
}
