package com.aleyn.app_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping(path = "/loans")
public class LoansController {

    @GetMapping
    public Map<String, String> welcome() {
        // ... business logic
        return Collections.singletonMap("msj", "loans");
    }

}