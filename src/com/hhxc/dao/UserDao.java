package com.hhxc.dao;


import com.hhxc.entity.User;

import java.util.List;

public interface UserDao {
    List<User> selectAll();
}
