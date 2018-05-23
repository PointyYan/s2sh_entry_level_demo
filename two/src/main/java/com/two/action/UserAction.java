package com.two.action;

import com.opensymphony.xwork2.ActionSupport;
import com.two.entity.User;
import com.two.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * @Author: VaporYan
 * @Decription:
 * @Date: Created in 14:33 2018/5/23
 * @Modified By:
 */
@Controller("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport {

    @Autowired
    private UserService userService;

    private User user;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String login() {
        User u = userService.findByName(user.getUsername(), user.getPassword());
        if (u != null) {
            return SUCCESS;
        }else {
            return ERROR;
        }
    }

}
