package com.s2shdemo.service.impl;

import com.s2shdemo.dao.UserDAO;
import com.s2shdemo.entity.User;
import com.s2shdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: VaporYan
 * @Decription:
 * @Date: Created in 11:21 2018/5/21
 * @Modified By:
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public boolean addUser(User user) {
        this.userDAO.add(user);
        return true;
    }

    @Override
    public boolean login(User user) {
        return this.userDAO.login(user);
    }

    @Override
    public List getAllUser() {
        return this.userDAO.getUser();
    }

    @Override
    public User getUserById(int id) {
        return this.userDAO.getUser(id);
    }

    @Override
    public boolean updateUser(User user) {
        this.userDAO.update(user);
        return true;

    }

    @Override
    public boolean deleteUser(int id) {
        this.userDAO.delete(id);
        return true;
    }
}
