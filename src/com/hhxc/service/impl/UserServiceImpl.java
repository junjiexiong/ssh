package com.hhxc.service.impl;

import com.hhxc.dao.UserDao;
import com.hhxc.entity.User;
import com.hhxc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> selectAll () {
        List<User> list = userDao.selectAll();
        return list;
    }
}
