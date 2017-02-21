package com.aloha.service.impl;

import com.aloha.dao.UserMapper;
import com.aloha.model.User;
import com.aloha.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * com.aloha.service.impl
 *
 * @author liyang
 * @name UserServiceImpl
 * @description
 * @date 2017-02-20 16:58
 * <p>
 * <p>
 *  Copyright (c) 2016 山东安合信达电子科技有限公司 版权所有 
 *  shandong aloha CO.,LTD. All Rights Reserved. 
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAll(User user) {
        if(user.getPage()!=null&&user.getRows()!=null){
            PageHelper.startPage(user.getPage(),user.getRows());
        }
        return userMapper.selectAll();
    }
}
