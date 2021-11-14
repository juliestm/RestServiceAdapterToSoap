package org.example.adapter.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name = "AddResponse")
public class AddResult extends Result {

    @XmlElement(name = "AddResult")
    private Integer value;
}
