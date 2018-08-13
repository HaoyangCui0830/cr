package com.zxy.cr.dao;

import com.zxy.cr.domain.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDao {


    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    //create
    public void save(UserEntity user){
        this.getSession().save(user);
    }

    //read


    //update


    //delete


}

