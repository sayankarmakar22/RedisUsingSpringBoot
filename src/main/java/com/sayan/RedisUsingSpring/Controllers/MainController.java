package com.sayan.RedisUsingSpring.Controllers;

import com.sayan.RedisUsingSpring.Model.Student;
import com.sayan.RedisUsingSpring.Services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class MainController {
    @Autowired
    private StudentServices studentServices;

    @PostMapping("/save")
    public ResponseEntity<Student> save(@RequestBody Student student){
        return new ResponseEntity<>(studentServices.save(student), HttpStatus.CREATED);
    }

    @GetMapping("/view/{id}")
    public ResponseEntity<Student> view(@PathVariable  int id){
        return new ResponseEntity<>(studentServices.view(id),HttpStatus.FOUND);
    }
}
