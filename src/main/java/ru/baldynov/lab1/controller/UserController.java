package ru.baldynov.lab1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.baldynov.lab1.model.User;
import ru.baldynov.lab1.service.UserService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    List<User> all() {
        return userService.findAll();
    }

    @GetMapping("/read/{id}")
    ResponseEntity<User> get(@PathVariable("id") Long id) {
        Optional<User> user = userService.findById(id);
        return ResponseEntity.of(user);
    }

    @PostMapping("/create")
    ResponseEntity<User> create(@RequestBody User user) {
        User createdUser = userService.create(user);
        return ResponseEntity.of(Optional.of(createdUser));
    }

    @PostMapping("/update")
    ResponseEntity<User> update(@RequestBody User newUser) {
        Optional<User> updatedUser = userService.update(newUser);
        return ResponseEntity.of(updatedUser);
    }

    @PostMapping("/delete/{id}")
    ResponseEntity<User> delete(@PathVariable("id") Long id) {
        //userService.delete(id);

        Optional<User> user = userService.findById(id);
        if (user.isPresent()) {
            userService.delete(id);
            return ResponseEntity.of(user);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

    }

}
