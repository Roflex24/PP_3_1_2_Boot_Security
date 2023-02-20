package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.entity.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    User getUserById(Long id);

    void updateUserById(User user);

    void deleteUserById(Long id);

    List<User> getAllUsers();

    User getUserByName(String name);
}