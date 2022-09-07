package org.example;

import org.example.dao.UserDao;
import org.example.dto.UserDTO;
import org.example.entity.User;

import java.util.List;

public class Controller {
    private static final UserDao userDao = new UserDao();
    public int addUser(UserDTO userDTO) {
        userDao.saveUser(userDTO.toUserEntity());
        return userDTO.getUserId();
    }

    public List<User> getAllUsers() {
        return userDao.getUsers();
    }
}
