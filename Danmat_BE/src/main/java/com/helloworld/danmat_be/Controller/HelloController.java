package com.helloworld.danmat_be.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/data")
    public String test() {
        return "Hello, world!";
    }
}
