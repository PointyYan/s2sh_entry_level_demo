package com.s2shdemo.action;

import com.opensymphony.xwork2.ActionSupport;
import com.s2shdemo.entity.Member;
import com.s2shdemo.service.MemberService;

/**
 * @Author: VaporYan
 * @Decription:
 * @Date: Created in 16:43 2018/5/20
 * @Modified By:
 */
public class MemberRegisterAction extends ActionSupport {

    private Member member;
    private MemberService memberService;

    public Member getMember() {
        return member;
    }
    public void setMember(Member member) {
        this.member = member;
    }

    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }
    public String execute(){
        memberService.add(member);
        return SUCCESS;
    }

}
