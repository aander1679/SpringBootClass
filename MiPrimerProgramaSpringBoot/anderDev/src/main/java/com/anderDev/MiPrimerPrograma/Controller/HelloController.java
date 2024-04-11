package com.anderDev.MiPrimerPrograma.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/app/hello")
    public Map<String, Object> holaMundo(){
        Map<String,Object> json= new HashMap<>();
        json.put("message", "HOLA MUNDO SPRING BOOT API REST");
        json.put("date", new Date());
        return json;
    }

}
