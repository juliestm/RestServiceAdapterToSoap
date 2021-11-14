package org.example.adapter.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name = "MultiplyResponse")
public class MultiplyResult extends Result {

    @XmlElement(name = "MultiplyResult")
    private Integer value;
}
