package br.com.seed.otel.app2.controller;

import br.com.seed.otel.app2.feign.App3Integration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private App3Integration app3Integration;

    @GetMapping("app2/{message}")
    public String getMessage(@PathVariable("message") String message){
        String message3 = message + "3";
        return app3Integration.getMessage(message3);
    }
}
