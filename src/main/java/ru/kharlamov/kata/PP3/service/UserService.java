package ru.kharlamov.kata.PP3.service;



import ru.kharlamov.kata.PP3.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void saveUser(User user);

    User showUser (Long id);

    void update(Long id, User user);

    void delete(Long id);
}

