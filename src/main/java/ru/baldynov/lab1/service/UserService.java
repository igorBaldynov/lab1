package ru.baldynov.lab1.service;

import ru.baldynov.lab1.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAll();
    User create(User user);
    Optional<User> findById(Long id);
    Optional<User> update(User user);
    void delete(Long id);
}
