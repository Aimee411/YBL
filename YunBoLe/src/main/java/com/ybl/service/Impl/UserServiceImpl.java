package com.ybl.service.Impl;

import com.ybl.dao.*;
import com.ybl.entity.*;
import com.ybl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    EmploymentMapper employmentMapper;
    @Autowired
    User_EmploymentMapper userEmploymentMapper;
    @Autowired
    ResumeMapper resumeMapper;
    @Autowired
    Resume_EmploymentMapper resume_employmentMapper;


    @Override
    public User login(int userid) {
        User user = userMapper.selectByPrimaryKey(userid);
        return user;
    }

    @Override
    public int regist(User user) {
        int n = userMapper.insertSelective(user);
        return n;
    }

    @Override
    public int logout(int userid) {
        int n = userMapper.deleteByPrimaryKey(userid);
        return 0;
    }

    @Override
    public List<Employment> findAllEmpment() {
        List<Employment> list = employmentMapper.selectAllemp();
        return list;
    }

    @Override
    public List<Employment> findAllUserCollEmp(int userid) {
        List<User_Employment> list = userEmploymentMapper.findAllUserCollEmp(userid);
        List<Employment> list1 = null;
        for (User_Employment ue : list
        ) {
            Employment employment = employmentMapper.selectByPrimaryKey(ue.getEmpid());
            list1.add(employment);
        }
        return list1;
    }

    //收藏招聘信息
    @Override
    public int collectEmp(User_Employment userEmployment) {
        int n = userEmploymentMapper.insert(userEmployment);
        return n;
    }

    //取消收藏招聘信息
    @Override
    public int cancelCollectEmp(User_Employment userEmployment) {
        int n = userEmploymentMapper.deleteByPrimaryKey(userEmployment);
        return n;
    }

    @Override
    public int updateUserInfo(User user) {
        int n = userMapper.updateByPrimaryKeySelective(user);
        return n;
    }

    @Override
    public List<Resume> findAllResume(int userid) {
        List<Resume> list = resumeMapper.findMyAllResume(userid);
        return list;
    }

    //9、查询简历投递记录以及结果（首先找到我的简历，然后根据简历id查找投递记录）
    @Override
    public List<Resume_Employment> findDeliverResume(int userid) {
        List<Resume> list = resumeMapper.findMyAllResume(userid);//找到所有我的简历
        List<Resume_Employment> list2 = null;
        for (Resume resume : list) {
            Resume_Employment resumeEmployment = resume_employmentMapper.findDeliResByRid(resume.getRid());
            list2.add(resumeEmployment);
        }
        return list2;
    }


    @Override
    public int addResume(Resume resume) {
        int n = resumeMapper.insertSelective(resume);
        return n;
    }

    @Override
    public int updateResume(Resume resume) {
        int n = resumeMapper.updateByPrimaryKeySelective(resume);
        return n;
    }

    @Override
    public int deliverResume(Resume_Employment resume_employment) {
        int n = resume_employmentMapper.deliverResume(resume_employment);
        return n;
    }

    @Override
    public int delResume(int rid) {
        int n = resumeMapper.deleteByPrimaryKey(rid);
        return n;
    }
}
