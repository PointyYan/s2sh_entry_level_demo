package com.two.service;

import com.two.entity.User;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @Author: VaporYan
 * @Decription:
 * @Date: Created in 13:30 2018/5/24
 * @Modified By:
 */
public class ServiceTest {

    private UserServiceImpl userService;

//    @Test
    @Ignore
    public void Test() {
        String a = "kin";
        String b = "123456";
        User user = userService.findByName(a,b);
        System.out.println(user);
        System.out.println(userService.findByName(a,b));
    }

}
