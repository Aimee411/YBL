package com.ybl.dao;

import com.ybl.entity.Admin;

import java.util.List;

public interface AdminMapper {
    //查询所有管理员账号
    List<Admin> findAllAdmin();

    //根据id删除管理员账号
    int deleteByPrimaryKey(Integer adminid);

    int insert(Admin record);

    //添加管理员账号
    int insertSelective(Admin record);

    //根据id查管理员账号
    Admin selectByPrimaryKey(Integer adminid);

    //修改密码等个人信息
    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}