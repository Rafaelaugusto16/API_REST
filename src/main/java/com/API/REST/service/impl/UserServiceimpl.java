package com.API.REST.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.API.REST.Model.User;
import com.API.REST.Repository.UserRepository;
import com.API.REST.service.UserService;

@Service
public class UserServiceimpl implements UserService {

    private final UserRepository userRepository;

   

    public UserServiceimpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("This User Account number already exist.");
        }
        return userRepository.save(userToCreate);

    }
    
}
