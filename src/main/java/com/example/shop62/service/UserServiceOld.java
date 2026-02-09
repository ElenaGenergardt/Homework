package com.example.shop62.service;

import com.example.shop62.model.User;
import com.example.shop62.repository.UserRepository;
import com.example.shop62.repository.UserRepositoryDB;
import com.example.shop62.repository.UserRepositoryImpl;
import com.example.shop62.repository.UserRepositoryMap;


public class UserServiceOld {
    // Жёская связь с конкретной реализацией
    private UserRepository userRepository = new UserRepositoryMap();
    // Жёская связь с абстрактной реализацией
    private UserRepository userRepository2 = new UserRepositoryImpl();

    private UserRepositoryDB userRepositoryDB = new UserRepositoryDB();

    private InputUserService inputUserService = new InputUserService();

    private EmailService emailService = new EmailService();

    User newUser = inputUserService.addNewUser();
/*
    if( newUser != null) {
        userRepositoryDB.save(newUser);
        emailService.sendEmail(newUser.getEmail(),"Welcome to Shop62", "Thank you for registering!");
    }else {
        System.out.println("User not added");
    }
    
 */
}
