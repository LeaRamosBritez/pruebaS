package com.prueba.prueba.Service.Implementacion;

import com.prueba.prueba.Service.Interface.HelloWorldService;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImp implements HelloWorldService {
    @Override
    public String generateHelloWorldMessage() {
        return "hola mundo";
    }
}
