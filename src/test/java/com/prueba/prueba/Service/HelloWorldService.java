package com.prueba.prueba.Service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String generateHelloWorldMessage() {
        return "hola mundo";
    }
}
