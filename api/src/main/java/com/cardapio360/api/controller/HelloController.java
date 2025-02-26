package com.cardapio360.api.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Operation(summary = "Greet the user", description = "Returns a greeting message based on the 'name' parameter")
    @GetMapping("/hello")
     public String sayHello(
        @Parameter(description = "Name of the person to greet", required = false) 
        @RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello, " + name + "!";
    }
}