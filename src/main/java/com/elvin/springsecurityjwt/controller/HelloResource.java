package com.elvin.springsecurityjwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Elvin Shrestha on 28/11/2019
 */
@RestController
public class HelloResource {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

}
