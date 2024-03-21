package com.caisse.service;

import com.caisse.entity.user;
import com.caisse.repository.userRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class userService {
    private userRepository UserRepository;
    public List<user> getUsers() {
       return UserRepository.findAll() ;
    }
}
