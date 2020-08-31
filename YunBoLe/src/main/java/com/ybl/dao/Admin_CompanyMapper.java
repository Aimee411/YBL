package com.ybl.dao;

import com.ybl.entity.Admin_Company;
import com.ybl.entity.Admin_CompanyKey;

import java.util.List;

public interface Admin_CompanyMapper {
    //查看未审核企业id
    List<Admin_Company> findAllNoAudit();

    int deleteByPrimaryKey(Admin_CompanyKey key);

    int insert(Admin_Company record);

    int insertSelective(Admin_Company record);

    Admin_Company selectByPrimaryKey(Admin_CompanyKey key);

    int updateByPrimaryKeySelective(Admin_Company record);

    int updateByPrimaryKey(Admin_Company record);
}