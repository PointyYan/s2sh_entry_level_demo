package com.two.service;

import com.two.entity.User;

import java.util.List;

/**
 * @Author: VaporYan
 * @Decription:
 * @Date: Created in 11:00 2018/5/23
 * @Modified By:
 */
public interface UserService {

    public void add(User user);
    public void update(User user);
    public void delete(long id);
    public User findByName(String name,String password);
    public User findById(long id);
    public List findAll();

}
