package com.aloha.controller;

import com.aloha.model.User;
import com.aloha.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * com.aloha.controller
 *
 * @author liyang
 * @name UserController
 * @description
 * @date 2017-02-20 15:36
 * <p>
 * <p>
 *  Copyright (c) 2016 山东安合信达电子科技有限公司 版权所有 
 *  shandong aloha CO.,LTD. All Rights Reserved. 
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping(value = "/getAllUser")
    public PageInfo<User> getAll(User user){
        List<User> userList = userService.getAll(user);
        return new PageInfo<User>(userList);
    }
}
