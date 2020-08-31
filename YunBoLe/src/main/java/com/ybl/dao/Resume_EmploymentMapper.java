package com.ybl.dao;

import com.ybl.entity.Employment;
import com.ybl.entity.Resume_Employment;
import com.ybl.entity.Resume_EmploymentKey;

import java.util.List;

public interface Resume_EmploymentMapper {
    //删除投递记录
    int deleteByPrimaryKey(Resume_EmploymentKey key);

    List<Resume_Employment> findAllReEmp(int empid);

    Resume_Employment selectByPrimaryKey(Resume_EmploymentKey key);

    Resume_Employment findDeliResByRid(int Rid);

    //投递简历
    int deliverResume(Resume_Employment resume_employment);


    //修改简历状态
    int updateByPrimaryKey(Resume_Employment record);


}