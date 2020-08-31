package com.ybl.service;

import com.ybl.entity.*;

import java.util.List;

public interface UserService {
    //1、登录
    User login(int userid);

    //2、注册
    int regist(User user);

    //3、注销
    int logout(int userid);

    //4、查询所有招聘信息
    List<Employment> findAllEmpment();

    //5、查询所有收藏的招聘信息(User_Employment表首先查id）
    List<Employment>  findAllUserCollEmp(int userid);

    //6、收藏招聘信息
    int collectEmp(User_Employment userEmployment);
    //取消收藏招聘信息
    int cancelCollectEmp(User_Employment userEmployment);

    //7、修改个人信息或密码
    int updateUserInfo(User user);

    //8、查询自己的所有简历
    List<Resume> findAllResume(int userid);

    //9、查询简历投递记录以及结果（首先找到我的简历，然后根据简历id查找投递记录）
    List<Resume_Employment> findDeliverResume(int userid);

    //10、添加简历
    int addResume(Resume resume);

    //11、修改简历
    int updateResume(Resume resume);

    //12、投递简历(找到自己的简历id，然后找到职位id 添加一条记录）
    int deliverResume(Resume_Employment resume_employment);

    //13、删除某个简历
    int delResume(int rid);
    //14、发布留言
    /*    int addLeaveword(Resume resume);*/


}
