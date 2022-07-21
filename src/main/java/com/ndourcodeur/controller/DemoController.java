package com.ndourcodeur.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    /**
     *  URL ====> http://localhost:8080/api/v1/demo
     */
    @GetMapping("/")
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>("Hello and Welcome to NdourCodeur :)", HttpStatus.OK);
        System.out.println("Hello");
    }
}
