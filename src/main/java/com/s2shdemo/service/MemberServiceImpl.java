package com.s2shdemo.service;

import com.s2shdemo.dao.MemberDAO;
//import com.s2shdemo.dao.MemberDAOImpl;
import com.s2shdemo.entity.Member;

import java.util.List;

/**
 * @Author: VaporYan
 * @Decription:
 * @Date: Created in 15:44 2018/5/20
 * @Modified By:
 */
public class MemberServiceImpl implements MemberService {

    private MemberDAO memberDao;

    public void setMemberDao(MemberDAO memberDao) {
        this.memberDao = memberDao;
    }

    public void add(Member member) {
        if(memberDao.findById(member.getId())==null)
            memberDao.add(member);
    }

    public void update(Member member) {
        if(memberDao.findById(member.getId())!=null)
            memberDao.update(member);
    }

    public void delete(long id) {
        if(memberDao.findById(id)!=null)
            memberDao.delete(id);
    }

    public Member findByName(String name, String password) {
        return memberDao.findByName(name, password);
    }

    public Member findById(long id) {
        return memberDao.findById(id);
    }

    public List<Member> findAll() {
        return memberDao.findAll();
    }
}
