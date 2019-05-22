package com.zhonghao.springboot.mapper;

import com.zhonghao.springboot.entities.User;
import org.apache.ibatis.annotations.Select;

/**
 * 启动类扫描接口所在包，自动注入
 */
public interface UserMapper {

    @Select("select * from user where id = #{id}")
    User getUserById(Integer id);
}
