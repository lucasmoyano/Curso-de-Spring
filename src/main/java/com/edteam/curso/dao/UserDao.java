package com.edteam.curso.dao;

import com.edteam.curso.models.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

public interface UserDao {
    List<User> getAll();
    User get(long id);
    User register(User user);
    User update(User user);
    void delete(long id);
    public User login(User user);
}
