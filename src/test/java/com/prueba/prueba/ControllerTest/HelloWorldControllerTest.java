package com.prueba.prueba.ControllerTest;

import com.prueba.prueba.Service.HelloWorldService;
import com.prueba.prueba.Service.Implementacion.HelloWorldServiceImp;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class HelloWorldControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private HelloWorldServiceImp helloWorldService;

    @Test
    public void testHelloWorld() throws Exception {
        //when(helloWorldService.generateHelloWorldMessage()).thenReturn("hola mundo");
        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("hola mundo"));
    }

    @Test
    public void testDespedida() throws Exception {
        mockMvc.perform(get("/despedida"))
                .andExpect(status().isOk())
                .andExpect(content().string("adioss!"));
    }
}
