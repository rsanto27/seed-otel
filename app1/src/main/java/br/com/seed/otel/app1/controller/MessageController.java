package br.com.seed.otel.app1.controller;

import br.com.seed.otel.app1.feign.App2Integration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MessageController {

    @Autowired
    private App2Integration app2Integration;


    @GetMapping("app1/{message}")
    public String getMessage(@PathVariable("message") String message){
        String message2 = message + "2";
        return app2Integration.getMessage(message2);
    }
}
