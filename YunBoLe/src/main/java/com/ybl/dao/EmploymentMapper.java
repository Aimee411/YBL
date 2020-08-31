package com.ybl.dao;

import com.ybl.entity.Employment;

import java.util.List;

public interface EmploymentMapper {
    //显示所有职位信息
    List<Employment> selectAllemp();

   // 删除职位信息
    int deleteByPrimaryKey(Integer empid);

 /*   int insert(Employment record);*/

    //发布职位信息
    int insertSelective(Employment record);

    //查询某个职位信息
    Employment selectByPrimaryKey(Integer empid);

    //修改职位信息
    int updateByPrimaryKeySelective(Employment record);

  /*  int updateByPrimaryKey(Employment record);*/
}