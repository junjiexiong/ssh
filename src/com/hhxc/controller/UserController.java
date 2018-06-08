package com.hhxc.controller;

import com.hhxc.entity.User;
import com.hhxc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: xiong
 * @Date: 2018/6/7 17:40
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/userList")
    public String selectAll(Model model){
        List<User> list = userService.selectAll();
        model.addAttribute("list",list);
        return "list";
    }
}
