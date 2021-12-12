package ru.baldynov.lab1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.baldynov.lab1.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
