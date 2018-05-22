package com.s2shdemo.action;

import com.opensymphony.xwork2.ActionSupport;
import com.s2shdemo.service.MemberService;

/**
 * @Author: VaporYan
 * @Decription:
 * @Date: Created in 16:00 2018/5/20
 * @Modified By:
 */
public class MemberDeleteAction extends ActionSupport {

    private MemberService memberService;

    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }

    private long id;


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String execute(){
        memberService.delete(getId());
        return SUCCESS;
    }
}
