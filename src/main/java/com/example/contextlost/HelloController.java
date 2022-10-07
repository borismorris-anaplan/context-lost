package com.example.contextlost;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HelloController {

    public static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    private final MyService service;

    public HelloController(final MyService service) {
        this.service = service;
    }

    @GetMapping
    public Map<String, String> echo() {
        logger.info("About to do some service stuff");
        service.service();

        return Map.of("greeting", "hello");
    }
}
