package com.ybl.dao;

import com.ybl.entity.User;

import java.util.List;

public interface UserMapper {
    //查询所有个人用户
    List<User> findAllUser();

    //删除个人用户
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}