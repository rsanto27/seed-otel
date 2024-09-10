package br.com.seed.otel.app3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {


    @GetMapping("app3/{message}")
    public String getMessage(@PathVariable("message") String message){
        return message;
    }
}
