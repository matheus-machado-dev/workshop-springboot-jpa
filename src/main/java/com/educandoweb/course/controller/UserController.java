package com.educandoweb.course.controller;

import com.educandoweb.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> findAll(){

        User u = new User(1L, "Matheus", "matheus@gmail.com", "99999999", "21343");
        return ResponseEntity.ok().body(u);
    }
}
