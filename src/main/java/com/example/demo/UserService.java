package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        userRepository.save(new User(null, "Petr", "xdenis@yandex.ru"));
        userRepository.save(new User(null, "Anna", "x34fg@yandex.ru"));
        userRepository.save(new User(null, "Oleg", "cfhr56@yandex.ru"));
        return userRepository.findAll();
    }

    public User getUserById(Long id){
        return userRepository.findById(id);
    }
}
