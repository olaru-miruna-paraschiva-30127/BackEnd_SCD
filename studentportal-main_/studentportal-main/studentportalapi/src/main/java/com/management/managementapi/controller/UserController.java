package com.management.managementapi.controller;

import com.management.managementapi.MailSenderService;
import com.management.managementapi.model.User;
import com.management.managementapi.repository.DepartmentRepository;
import com.management.managementapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    private MailSenderService mailService;

    @PostMapping("/mail")
    public void Foo(){
        mailService.sendNewMail("mirunaolaru58@gmail.com", "Subject right here", "Body right there!");
    }

    @PostMapping
    public List<User> findAllUser(){
        return userService.findAllUser();
    }
}


