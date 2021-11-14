package org.example.adapter.config;

import org.example.adapter.client.CalculatorSOAPClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("org.example.adapter.model");
        return marshaller;
    }

    @Bean
    public CalculatorSOAPClient soapClient(Jaxb2Marshaller marshaller) {
        CalculatorSOAPClient client = new CalculatorSOAPClient();
        client.setDefaultUri("http://dneonline.com/calculator.asmx");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

}
