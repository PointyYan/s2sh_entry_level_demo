package com.s2shdemo.action;

import com.opensymphony.xwork2.ActionSupport;
import com.s2shdemo.entity.Member;
import com.s2shdemo.service.MemberService;

import org.apache.struts2.ServletActionContext;

import java.util.List;

/**
 * @Author: VaporYan
 * @Decription:
 * @Date: Created in 16:23 2018/5/20
 * @Modified By:
 */
public class MemberQueryAction extends ActionSupport {

    private MemberService memberService;

    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }

    public String execute(){
        List<Member> list = memberService.findAll();
        ServletActionContext.getRequest().setAttribute("memberList", list);
        return SUCCESS;
    }
}