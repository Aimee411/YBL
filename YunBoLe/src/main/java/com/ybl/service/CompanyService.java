package com.ybl.service;


import com.ybl.entity.Company;
import com.ybl.entity.Employment;
import com.ybl.entity.Resume;
import com.ybl.entity.Resume_Employment;

import java.util.List;

public interface CompanyService {
    //注册（操作公司表）
    public int regist(Company company);

    //登录（操作公司表）
    public Company login(int companyid);

    //注销（操作公司表）
    public int logout(int companyid);


    //修改公司信息（操作公司表）
    public int updateCompanyInfo(Company company);

    //查询所有招聘信息（操作招聘信息表）
    public List<Employment> findAllEmployment();

    //发布招聘信息（操作招聘信息表）
    public int publishEmployment(Employment record);

    //修改招聘信息（操作招聘信息表）
    public int modEmployment(Employment record);

    //删除招聘信息（操作招聘信息表）
    public int delEmployment(int empid);

    //查询本公司所有投递简历（得到的结果中的简历id与招聘信息id  然后查询内容）
    public List<Resume_Employment>  findAllReEmp(int companyid);

    //根据简历id查简历内容-操作简历表
    public Resume checkResume(int rid);

    //根据招聘信息id查招聘信息-操作简历信息表
    public Employment checkEmployment(int empid);

    //修改简历状态（操作简历——招聘信息表）
    public int modResumeStatus(Resume_Employment resume_employment);
}
