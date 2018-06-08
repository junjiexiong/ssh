package com.hhxc.dao.impl;

import com.hhxc.dao.UserDao;
import com.hhxc.entity.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("UserDao")
public class UserDaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;
    public List<User> selectAll(){
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from User");
        List<User> list = query.list();
        session.close();
        return list;
    }
}
