package com.ybl.dao;

import com.ybl.entity.User_Employment;
import com.ybl.entity.User_EmploymentKey;

import java.util.List;

public interface User_EmploymentMapper {
    //取消收藏简历
    int deleteByPrimaryKey(User_EmploymentKey key);

    //收藏简历
    int insert(User_Employment record);

    int insertSelective(User_Employment record);

    User_Employment selectByPrimaryKey(User_EmploymentKey key);


    //查找已收藏简历
    List<User_Employment> findAllUserCollEmp(int userid);
}