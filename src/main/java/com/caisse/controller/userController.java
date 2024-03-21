package com.caisse.controller;

import com.caisse.entity.user;
import com.caisse.service.userService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
@RequestMapping("/api/v1")
public class userController {
    private userService UserService;
    @GetMapping("/user")
    public List<user> getUsers()
    {
        return UserService.getUsers();
    }

}
