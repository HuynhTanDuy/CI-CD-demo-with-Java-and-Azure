package com.dms.ai.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController()
public class MainController {

    private static final String[] NAMES = {"Duy Huynh", "Hai Nguyen", "Duy Vo"};

    @GetMapping(value = "/process")
    public String helloWorld() {
        Random random = new Random();
        return String.format("Hello %s", NAMES[random.nextInt(NAMES.length)]);
    }
}
