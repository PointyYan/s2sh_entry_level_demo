package com.s2shdemo.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.s2shdemo.entity.User;
import com.s2shdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.Map;

/**
 * @Author: VaporYan
 * @Decription:
 * @Date: Created in 11:23 2018/5/21
 * @Modified By:
 */
@Controller("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport {

    @Autowired
    private UserService userService;

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String login() {
        if(userService.login(user)){
            Map session = ActionContext.getContext().getSession();
            session.put("user", user);
            return SUCCESS;
        }else {
            return ERROR;
        }

    }
}
