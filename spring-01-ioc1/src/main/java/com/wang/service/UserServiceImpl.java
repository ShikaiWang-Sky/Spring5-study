package com.wang.service;

import com.wang.dao.UserDao;

public class UserServiceImpl implements UserService{

    private UserDao userDao;

    //利用Set进行动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
