package com.s2shdemo.service;

import com.s2shdemo.entity.User;

import java.util.List;

/**
 * @Author: VaporYan
 * @Decription:
 * @Date: Created in 11:20 2018/5/21
 * @Modified By:
 */
public interface UserService {

    public boolean addUser(User user);

    public boolean login(User user);

    public List getAllUser();

    public User getUserById(int id);

    public boolean updateUser(User user);

    public boolean deleteUser(int id);

}
