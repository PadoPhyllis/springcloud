package com.padophyllis.user.service;

import com.padophyllis.feign.pojo.User;
import com.padophyllis.user.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User queryById(Long id){
        return userDao.queryById(id);
    }
}
