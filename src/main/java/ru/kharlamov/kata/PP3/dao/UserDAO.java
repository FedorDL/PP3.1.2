package ru.kharlamov.kata.PP3.dao;



import ru.kharlamov.kata.PP3.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();

    void saveUser(User user);

    User showUser (Long id);

    void update(User user);

    void delete(Long id);
}
