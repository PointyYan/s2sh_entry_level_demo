package com.two.dao;

import com.two.entity.User;
//import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: VaporYan
 * @Decription:
 * @Date: Created in 11:19 2018/5/24
 * @Modified By:
 */
public class DaoTest {

    private UserDaoImpl userDao;

//    @Test
    @Ignore
    public void findByNameTest(){
        String a = "kin";
        String b = "123456";
        User user = userDao.findByName(a,b);
        System.out.println(user);
        System.out.println(userDao.findByName(a,b));
    }

}
