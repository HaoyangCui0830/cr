package com.zxy.cr.services;


import com.zxy.cr.dao.UserDao;
import com.zxy.cr.domain.UserEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("UserService")
@Transactional
public class UserService {

    private UserDao userDao;

    public void saveUser(UserEntity user){
        userDao.save(user);
    }
}
