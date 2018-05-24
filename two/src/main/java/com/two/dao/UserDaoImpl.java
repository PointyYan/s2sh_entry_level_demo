package com.two.dao;

import com.two.entity.User;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: VaporYan
 * @Decription:
 * @Date: Created in 9:44 2018/5/23
 * @Modified By:
 */
@Transactional(rollbackFor = Exception.class)
@Repository("userDao")
public class UserDaoImpl implements UserDao{

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    public UserDaoImpl(SessionFactory sessionFactory) {
    }

    public void add(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    public void update(User user) {
        sessionFactory.getCurrentSession().update(user);
    }

    public void delete(long id) {
        sessionFactory.getCurrentSession().delete(
                sessionFactory.getCurrentSession().get(User.class, id)
        );
    }

    public User findByName(String name, String password) {
        String hsql = "FROM User u where u.username=? and u.password=?";
        User user = null;
        try {
            Query query = sessionFactory.getCurrentSession().createQuery(hsql);
            query.setParameter(0, name);
            query.setParameter(1, password);
            user = (User) query.uniqueResult();

            String a = user.getUsername();
            String b = user.getPassword();
            System.out.println("dao"+a+"|"+b+"|"+name+"|"+password+"|"+user.getUsername()+"|"+user);

        }catch (Exception ignored){

        }
        return user;
    }

    public User findById(long id) {
        //TODO
        return null;
    }

    public List findAll() {
        return sessionFactory.getCurrentSession().createQuery("FROM User").list();
    }
}
