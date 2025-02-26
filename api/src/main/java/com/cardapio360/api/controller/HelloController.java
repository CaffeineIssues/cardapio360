package com.cardapio360.api.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Operation;

@RestController
public class HelloController {
  
    @Operation(summary = "Returns a Hello World message", description = "This endpoint returns a simple Hello World string.")
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}