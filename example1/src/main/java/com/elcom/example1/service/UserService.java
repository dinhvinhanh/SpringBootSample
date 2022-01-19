package com.elcom.example1.service;

import com.elcom.example1.model.User;
import com.elcom.example1.repository.UserRepository;

import java.util.List;
import java.util.Optional;

public interface UserService{

    List<User> findAll();

    Optional<User> findByID(Long id);

    User saveUser(User user);

    void removeUser (Long id);

}
