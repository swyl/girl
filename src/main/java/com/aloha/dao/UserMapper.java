package com.aloha.dao;

import com.aloha.model.User;
import com.aloha.util.MyMapper;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper extends MyMapper<User> {
}