@XmlSchema(
        namespace= XmlProperties.NAMESPACE_URI,
        elementFormDefault= XmlNsForm.QUALIFIED,
        xmlns = {@XmlNs(namespaceURI = XmlProperties.NAMESPACE_URI, prefix = "")})
package org.example.adapter.model;

import org.example.adapter.model.property.XmlProperties;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;