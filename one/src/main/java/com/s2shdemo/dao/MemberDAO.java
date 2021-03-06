package com.s2shdemo.dao;

import com.s2shdemo.entity.Member;

import java.util.List;

/**
 * @Author: VaporYan
 * @Decription:
 * @Date: Created in 14:52 2018/5/20
 * @Modified By:
 */
public interface MemberDAO {

    public void add(Member member);

    public void update(Member member);

    public void delete(long id);

    public Member findByName(String name,String password);

    public Member findById(long id);

    public List<Member> findAll();

}
