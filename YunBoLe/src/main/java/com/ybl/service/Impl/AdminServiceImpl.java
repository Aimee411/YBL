package com.ybl.service.Impl;

import com.ybl.dao.*;
import com.ybl.entity.*;
import com.ybl.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;
    @Autowired
    UserMapper userMapper;
    @Autowired
    EmploymentMapper employmentMapper;
    @Autowired
    CompanyMapper companyMapper;
    @Autowired
    User_EmploymentMapper userEmploymentMapper;
    @Autowired
    ResumeMapper resumeMapper;
    @Autowired
    Resume_EmploymentMapper resume_employmentMapper;
    @Autowired
    Admin_CompanyMapper admin_companyMapper;

    @Override
    public Admin login(int adminid) {
        Admin admin=adminMapper.selectByPrimaryKey(adminid);
        return admin;
    }

    @Override
    public List<User> findAllUser() {
        List<User> list=userMapper.findAllUser();
        return list;
    }

    @Override
    public int delUserById(int userid) {
        int n=userMapper.deleteByPrimaryKey(userid);
        return n;
    }

    @Override
    public List<Company> findAllCompany() {
        List<Company> list=companyMapper.findAllCompany();
        return list;
    }

    @Override
    public int delCompanyById(int companyid) {
        int n=companyMapper.deleteByPrimaryKey(companyid);
        return n;
    }

    @Override
    public List<Employment> findAllEmployment() {
        List<Employment> list=employmentMapper.selectAllemp();
        return list;
    }

    @Override
    public int delEmployment(int empid) {
        int n=employmentMapper.deleteByPrimaryKey(empid);
        return n;
    }

    @Override
    public int addEmployment(Employment employment) {
        int n=employmentMapper.insertSelective(employment);
        return n;
    }

    @Override
    public List<Resume> findAllResume() {
        List<Resume> list=resumeMapper.findAllResume();
        return list;
    }

    @Override
    public int delResume(int rid) {
        int n=resumeMapper.deleteByPrimaryKey(rid);
        return n;
    }

    @Override
    public List<Company> findNoAudit() {
        List<Admin_Company> list=admin_companyMapper.findAllNoAudit();
        List<Company> list1=null;
        for (Admin_Company ac:list
             ) {
            Company company=companyMapper.selectByPrimaryKey(ac.getCompanyId());
            list1.add(company);
        }
        return list1;
    }

    @Override
    public int auditCompany(Admin_Company admin_company) {
        //更新审核表
        int n=admin_companyMapper.updateByPrimaryKeySelective(admin_company);
        return n;
    }

    @Override
    public int updatePwd(Admin admin) {
        int n=adminMapper.updateByPrimaryKeySelective(admin);
        return n;
    }

    @Override
    public List<Admin> findAllAdmin() {
        List<Admin> list=adminMapper.findAllAdmin();
        return list;
    }

    @Override
    public int delAdmin(int adminid) {
        int n=adminMapper.deleteByPrimaryKey(adminid);
        return n;
    }

    @Override
    public int addAdmin(Admin admin) {
        int n=adminMapper.insertSelective(admin);
        return n;
    }
}
