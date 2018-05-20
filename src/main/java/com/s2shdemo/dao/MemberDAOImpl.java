package com.s2shdemo.dao;

import com.s2shdemo.entity.Member;
import org.apache.taglibs.standard.lang.jstl.NullLiteral;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Query;

import java.util.List;

/**
 * @Author: VaporYan
 * @Decription:
 * @Date: Created in 14:52 2018/5/20
 * @Modified By:
 */
public class MemberDAOImpl implements MemberDAO{

    private SessionFactory sessionFactory;

    //构造方法注入SessionFactory对象
    public MemberDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory=sessionFactory;
    }

    //使用SessionFactory对象返回Session对象
    public Session currentSession(){
        return sessionFactory.openSession();
    }

    public void add(Member member) {
        Session session = null;
        try {
            session = currentSession();
            Transaction tx = session.beginTransaction();
            session.save(member);
            tx.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }finally{
            session.close();
        }
    }

    public void update(Member member) {
        Session session = null;
        try {
            session = currentSession();
            Transaction tx = session.beginTransaction();
            session.update(member);
            tx.commit();
        }catch (HibernateException e) {
            e.printStackTrace();
        }finally{
            session.close();
        }
    }

    public void delete(long id) {
        Session session = null;
        try {
            session = currentSession();
            Transaction tx = session.beginTransaction();
            Member member = (Member) session.get(Member.class, id);
            session.delete(member);
            tx.commit();
        }catch (HibernateException e) {
            e.printStackTrace();
        }finally{
            session.close();
        }
    }

    public Member findByName(String name, String password) {
        Session session = null;
        Member result = null;
        try {
            session = currentSession();
            Transaction tx = session.beginTransaction();
            String hsql = " from Member m where m.name = :mname and m.password = :mpassword";
            Query query = session.createQuery(hsql);
            query.setParameter("mname", name);
            query.setParameter("mpassword", password);
            result = (Member)query.uniqueResult();
            tx.commit();
        }catch (HibernateException e) {
            e.printStackTrace();
        }finally{
            session.close();
        }
        return result;
    }

    public Member findById(long id) {
        Session session=null;
        Member result = null;
        try {
            session=currentSession();
            Transaction tx = session.beginTransaction();
            String hsql = " from Member m where m.id = :id";
            Query query = session.createQuery(hsql);
            query.setParameter("id",id);
            result = (Member)query.uniqueResult();
            tx.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }finally{
            session.close();
        }
        return result;
    }

    public List<Member> findAll() {
        Session session=null;
        List<Member> list = null;
        try {
            session=currentSession();
            Transaction tx = session.beginTransaction();
            String hsql = " from Member";
            Query query = session.createQuery(hsql);
            list = query.list();
            tx.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }finally{
            session.close();
        }
        return list;
    }
}
