package com.training.feign.demo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final Logger logger = Logger.getLogger(GreetingController.class.getName());

    @GetMapping
    public String formatGreeting(@RequestParam String name) {
        logger.info("Receiving call to format greeting for name "+ name);
        return "Hello " + name;
    }
}
