package ru.kata.spring.boot_security.demo.service;



import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    List<User> listUsers();

    void updateUser(User user);

    void addUser(User user);

    User getUserById(Long id);

    User getUserByName(String name);

    void deleteUser(User user);
}
