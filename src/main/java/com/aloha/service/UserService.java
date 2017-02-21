package com.aloha.service;

import com.aloha.model.User;

import java.util.List;

/**
 * com.aloha.service
 *
 * @author liyang
 * @name UserService
 * @description
 * @date 2017-02-20 16:58
 * <p>
 * <p>
 *  Copyright (c) 2016 山东安合信达电子科技有限公司 版权所有 
 *  shandong aloha CO.,LTD. All Rights Reserved. 
 */
public interface UserService {
    List<User> getAll(User user);
}
