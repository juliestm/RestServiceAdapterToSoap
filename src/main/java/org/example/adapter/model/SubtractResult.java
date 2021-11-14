package org.example.adapter.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name = "SubtractResponse")
public class SubtractResult extends Result {

    @XmlElement(name = "SubtractResult")
    private Integer value;
}
