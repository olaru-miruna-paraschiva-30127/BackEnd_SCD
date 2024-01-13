package com.management.managementapi.service;

import com.management.managementapi.model.User;
import com.management.managementapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserServiceInterface {

    @Autowired
    UserRepository userRepository;


    @Override
    public List<User> findAllUser() {
        return userRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

}

