package com.s2shdemo.dao;

import com.s2shdemo.entity.User;

import java.util.List;

/**
 * @Author: VaporYan
 * @Decription:
 * @Date: Created in 10:40 2018/5/21
 * @Modified By:
 */
public interface UserDAO {

    /**
     * 添加并保存用户
     * @param user
     */
    public void add(User user);

    /**
     * 进行登录
     */
    public boolean login(User user);


    /**
     * 获取用户列表
     */
    public List getUser();

    /**
     * 根据用户Id获取用户信息
     * @param id
     * @return
     */
    public User getUser(int id);

    /**
     * 更新用户信息
     * @param user
     */
    public void update(User user);


    /**
     * 根据用户id删除用户信息
     * @param id
     */
    public void delete(int id);

}
