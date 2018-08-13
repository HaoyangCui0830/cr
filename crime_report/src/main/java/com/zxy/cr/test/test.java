package com.zxy.cr.test;

import com.zxy.cr.dao.UserDao;
import com.zxy.cr.domain.UserEntity;

public class test{
    public static void main(){
        UserEntity a = new UserEntity();
        a.setUserName("yzx");
        a.setUserPwd("123");
    UserDao userDao = new UserDao();
    userDao.save(a);

    }
}