package com.ybl.dao;

import com.ybl.entity.Company;

import java.util.List;

public interface CompanyMapper {
    //注销 删除企业
    int deleteByPrimaryKey(Integer companyId);

    //注册
    int insert(Company record);

    //登录 根据id查公司信息
   Company selectByPrimaryKey(Integer companyId);

    //修改信息
    int updateByPrimaryKeySelective(Company record);

    //查询所有企业用户
    List<Company> findAllCompany();









}