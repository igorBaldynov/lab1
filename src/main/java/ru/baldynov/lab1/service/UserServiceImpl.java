package ru.baldynov.lab1.service;

import org.springframework.stereotype.Service;
import ru.baldynov.lab1.dao.UserRepository;
import ru.baldynov.lab1.model.User;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public Optional<User> update(User newUser) {
        Optional<User> userOpt = userRepository.findById(newUser.getId());
        if (userOpt.isPresent()) {
            User oldUser = userOpt.get();
            oldUser.setName(newUser.getName());
            return Optional.of(userRepository.save(oldUser));
        } else {
            return Optional.empty();
        }
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
