package com.ybl.dao;

import com.ybl.entity.Resume;

import java.util.List;

public interface ResumeMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(Resume record);

    int insertSelective(Resume record);

    //根据简历id查询简历
    Resume selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(Resume record);

    int updateByPrimaryKey(Resume record);
    //查询所有简历
    List<Resume> findAllResume();

    //查询某用户的所有简历
    List<Resume> findMyAllResume(int userid);
}