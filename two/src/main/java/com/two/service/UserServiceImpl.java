package com.two.service;

import com.two.dao.UserDao;
import com.two.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: VaporYan
 * @Decription:
 * @Date: Created in 11:01 2018/5/23
 * @Modified By:
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(User user) {
        userDao.add(user);
    }

    public void update(User user) {
        userDao.update(user);
    }

    public void delete(long id) {
        userDao.delete(id);
    }

    public User findByName(String name, String password) {
        userDao.findByName(name, password);
        return null;
    }

    public User findById(long id) {
        //TODO
        return null;
    }

    public List findAll() {
        List list = null;
        list = userDao.findAll();
        return list;
    }
}
