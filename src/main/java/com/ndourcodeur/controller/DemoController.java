package com.ndourcodeur.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.comparator.Comparators;
import org.springframework.web.bind.annotation.*;

import com.ndourcodeur.model.Todo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/api/v1/demo")
public class DemoController {


    /**
     *  URL ====> http://localhost:8080/api/v1/demo
     */
    @GetMapping()
    public ResponseEntity<?> findAll(){
    	List<Todo> list = Arrays.asList(
    			new Todo(100, "", 1545.00),
    			new Todo(201, "", 5045.00),
    			new Todo(345, "", 1624.00),
    			new Todo(12, "", 1754.00),
    			new Todo(10, "", 4520.00)
    	);
    	list = list.stream()
    			.collect(Collectors.toList());
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    /**
     *  URL ====> http://localhost:8080/api/v1/demo/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return new ResponseEntity<>("Getting object by id:"+id, HttpStatus.OK);
    }
    
    /**
     *  URL ====> http://localhost:8080/api/v1/demo/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return new ResponseEntity<>("Getting object by id:"+id, HttpStatus.OK);
    }

    /**
     *  URL ====> http://localhost:8080/api/v1/demo/{id}
     */
    @PostMapping()
    public ResponseEntity<?> save(){
        return new ResponseEntity<>("Saving object", HttpStatus.CREATED);
    }

    /**
     *  URL ====> http://localhost:8080/api/v1/demo/{id}
     */
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id){
        return new ResponseEntity<>("Updating object by id:"+id, HttpStatus.CREATED);
    }

    /**
     *  URL ====> http://localhost:8080/api/v1/demo/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        return new ResponseEntity<>("Deleting object by id:"+id, HttpStatus.OK);
    }
}
