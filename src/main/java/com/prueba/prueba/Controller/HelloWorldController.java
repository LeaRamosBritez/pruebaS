package com.prueba.prueba.Controller;
import com.prueba.prueba.Service.Implementacion.HelloWorldServiceImp;
import com.prueba.prueba.Service.Interface.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private HelloWorldServiceImp helloWorldService;

    @GetMapping("/hello")
    public String helloWorld() {
        return "hola mundo";
    }

    @GetMapping("/despedida")
    public String despedida() {
        return "adioss!";
    }
}