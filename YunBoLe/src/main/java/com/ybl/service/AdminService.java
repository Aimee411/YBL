package com.ybl.service;

import com.ybl.dao.Admin_CompanyMapper;
import com.ybl.entity.*;

import java.util.List;

public interface AdminService {
    //1、登录
    Admin login(int adminid);

    //2、查询所有用户
    List<User> findAllUser();

    //3、删除用户
    int delUserById(int userid);

    //4、查询所有企业用户
    List<Company> findAllCompany();

    //5、删除企业用户
    int delCompanyById(int companyid);

    //6、查询所有招聘信息
    List<Employment> findAllEmployment();

    //7、删除招聘信息
    int delEmployment(int empid);

    //8、添加招聘信息
    int addEmployment(Employment employment);

    //9、查询所有简历
    List<Resume> findAllResume();

    //10、删除某个简历
    int delResume(int rid);

    //11、查询所有未审核公司
    List<Company> findNoAudit();

    //12、审核企业
    int auditCompany(Admin_Company admin_company);

    //13、修改密码
    int updatePwd(Admin admin);

    //14、查询所有管理员账号
    List<Admin> findAllAdmin();

    //15、删除管理员账号
    int delAdmin(int adminid);

    //16、添加管理员账号
    int addAdmin(Admin admin);
}
