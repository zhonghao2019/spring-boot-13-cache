package com.zhonghao.springboot.service;

import com.zhonghao.springboot.entities.User;
import com.zhonghao.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    /**
     * 加入缓存
     * @param id
     * @return
     */
    @Cacheable(cacheNames = "user")
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }
}
