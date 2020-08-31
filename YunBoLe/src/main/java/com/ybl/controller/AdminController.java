package com.ybl.controller;

import com.ybl.entity.*;
import com.ybl.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(path = "/admin")
public class AdminController {
    @Autowired
    AdminService adminService;

    //1、登录 @PathVariable("adminid") /{adminid}
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String  companyLogin( int adminid, String  adminpwd, HttpServletRequest request) {
      Admin admin=adminService.login(adminid);
        HttpSession session = request.getSession();
        if(admin!=null&&admin.getAdminpassword()==adminpwd){
            //验证码
            //本地存储用户
            session.setAttribute("adminid",adminid);
            return "success";
        }else {
            return "error";
        }
    }
    //2、查询所有用户
    @RequestMapping(value = "/findalluser", method = RequestMethod.GET)
    public String findAllEmp() {
        List<User> list=adminService.findAllUser();
        return "success";
    }
    //3、删除用户
    @RequestMapping(value = "/deluser/{uid}", method = RequestMethod.DELETE)
    public String delUser(@PathVariable("uid") int uid) {
        int n=adminService.delUserById(uid);
        if(n!=0){
            return "success";
        }else {
            return "error";
        }
    }
    //4、查询所有企业用户
    @RequestMapping(value = "/findallcomp", method = RequestMethod.GET)
    public String findAllCompany() {
        List<Company> list=adminService.findAllCompany();
        return "success";
    }
    //5、删除企业用户
    @RequestMapping(value = "/delcomp/{companyid}", method = RequestMethod.DELETE)
    public String delCompany(@PathVariable("companyid") int companyid) {
        int n;
        n = adminService.delCompanyById(companyid);
        if(n!=0){
            return "success";
        }else {
            return "error";
        }
    }
    //6、查询所有招聘信息
    @RequestMapping(value = "/findallemp", method = RequestMethod.GET)
    public String findAllEmployment() {
        List<Employment> list=adminService.findAllEmployment();
        return "success";
    }
    //7、删除招聘信息
    @RequestMapping(value = "/delemp/{empid}", method = RequestMethod.DELETE)
    public String delEmployment(@PathVariable("empid") int empid) {
        int n;
        n = adminService.delEmployment(empid);
        if(n!=0){
            return "success";
        }else {
            return "error";
        }
    }
    //8、添加招聘信息
    @RequestMapping(value = "/addemp", method = RequestMethod.PUT)
    public String addEmployment(Employment employment) {
        int n =adminService.addEmployment(employment);
        System.out.println(n);
        return "admin/success";
    }
    //9、查询所有简历
    @RequestMapping(value = "/findallres", method = RequestMethod.GET)
    public String findAllResume() {
        List<Employment> list=adminService.findAllEmployment();
        return "success";
    }
    //10、删除某个简历
     @RequestMapping(value = "/delres/{rid}", method = RequestMethod.DELETE)
    public String delResume(@PathVariable("rid") int rid) {
        int n;
        n = adminService.delResume(rid);
        if(n!=0){
            return "success";
        }else {
            return "error";
        }
    }
    //11、查询所有未审核公司
    @RequestMapping(value = "/findcompnoaudit", method = RequestMethod.GET)
    public String findCompNoAudit() {
        List<Company> list=adminService.findNoAudit();
        return "success";
    }
    //12、审核企业
    @RequestMapping(value = "/auditcomp", method = RequestMethod.POST)
    public String auditComp(Admin_Company admin_company) {
        int n=adminService.auditCompany(admin_company);
        if(n!=0){
            return "success";
        }else {
            return "error";
        }
    }
    //13、修改密码
    @RequestMapping(value = "/modadminpwd/{adminid}", method = RequestMethod.POST)
    public String modifyAdminPwd(@PathVariable("adminid") int adminid,Admin admin) {
        int n=adminService.updatePwd(admin);
        if(n!=0){
            return "success";
        }else {
            return "error";
        }
    }
    //14、查询所有管理员账号
    @RequestMapping(value = "/findalladmin", method = RequestMethod.GET)
    public String findAllAdmin() {
        List<Admin> list=adminService.findAllAdmin();
        return "success";
    }
    //15、删除管理员账号
    @RequestMapping(value = "/deladmin/{adminid}", method = RequestMethod.DELETE)
    public String delAdmin(@PathVariable("adminid") int adminid) {
        int n;
        n = adminService.delAdmin(adminid);
        if(n!=0){
            return "success";
        }else {
            return "error";
        }
    }
    //16、添加管理员账号
    @RequestMapping(value = "/addadmin", method = RequestMethod.PUT)
    public String addAdmin(Admin admin) {
        int n =adminService.addAdmin(admin);
        System.out.println(n);
        return "admin/success";
    }
}
