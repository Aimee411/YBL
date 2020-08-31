package com.ybl.service.Impl;

import com.ybl.dao.CompanyMapper;
import com.ybl.dao.EmploymentMapper;
import com.ybl.dao.ResumeMapper;
import com.ybl.dao.Resume_EmploymentMapper;
import com.ybl.entity.Company;
import com.ybl.entity.Employment;
import com.ybl.entity.Resume;
import com.ybl.entity.Resume_Employment;
import com.ybl.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    CompanyMapper companyDao;
    @Autowired
    EmploymentMapper employmentDao;
    @Autowired
    Resume_EmploymentMapper reEmpDao;
    @Autowired
    ResumeMapper resumeDao;

    @Override
    public int regist(Company company) {
        int n = companyDao.insert(company);
        return n;
    }

    @Override
    public Company login(int companyid) {
        Company company = companyDao.selectByPrimaryKey(companyid);
        return company;
    }

    @Override
    public int logout(int companyid) {
        int n = companyDao.deleteByPrimaryKey(companyid);
        return n;
    }


    @Override
    public int updateCompanyInfo(Company company) {
        int n = companyDao.updateByPrimaryKeySelective(company);
        return n;
    }

    @Override
    public List<Employment> findAllEmployment() {
        List<Employment> list = employmentDao.selectAllemp();
        return list;
    }

    @Override
    public int publishEmployment(Employment record) {
        int n = employmentDao.insertSelective(record);
        return n;
    }

    @Override
    public int modEmployment(Employment record) {
        int n = employmentDao.updateByPrimaryKeySelective(record);
        return n;
    }

    @Override
    public int delEmployment(int empid) {
        int n = employmentDao.deleteByPrimaryKey(empid);
        return n;
    }

    //查询本公司所有投递简历
    @Override
    public List<Resume_Employment> findAllReEmp(int empid) {
        List<Resume_Employment> list = reEmpDao.findAllReEmp(empid);
        return null;
    }

    //查询简历内容
    @Override
    public Resume checkResume(int rid) {
        Resume resume = resumeDao.selectByPrimaryKey(rid);
        return resume;
    }

    //查询招聘信息内容
    @Override
    public Employment checkEmployment(int empid) {
        Employment employment = employmentDao.selectByPrimaryKey(empid);
        return employment;
    }

    @Override
    public int modResumeStatus(Resume_Employment record) {
        int n = reEmpDao.updateByPrimaryKey(record);
        return n;
    }
}
