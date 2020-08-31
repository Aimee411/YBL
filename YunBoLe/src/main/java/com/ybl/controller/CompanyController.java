package com.ybl.controller;

import com.ybl.entity.Company;
import com.ybl.entity.Employment;
import com.ybl.entity.Resume;
import com.ybl.entity.Resume_Employment;
import com.ybl.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(path = "/company")
public class CompanyController {
    @Autowired
    CompanyService companyService;

    //1、注册(可复用）
    @RequestMapping(value = "/regist", method = RequestMethod.PUT)
    public String companyRegist(Company company) {
        System.out.println("注册公司");
        int n =companyService.regist(company);
        System.out.println(n);
        return "company/success";
    }

    //2、登录(可复用）
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String  companyLogin(int companyid, String  companypwd, HttpServletRequest request) {
        Company company=companyService.login(companyid);
        HttpSession session = request.getSession();
        if(company!=null&&company.getCompanyPwd()==companypwd){
            //验证码
            //本地存储用户
            session.setAttribute("companyid",companyid);
            return "success";
        }else {
            return "error";
        }
    }
    //3、注销(可复用）
    @RequestMapping(value = "/logout/{companyid}", method = RequestMethod.DELETE)
    public String companyLogout(@PathVariable("companyid") int companyid) {
        int n=companyService.logout(companyid);
        if(n!=0){
            return "success";
        }else {
            return "error";
        }

    }
    //4、修改公司信息
    @RequestMapping(value = "/modcompinfo/{companyid}", method = RequestMethod.POST)
    public String modifyCompany(@PathVariable("companyid") int companyid,Company company) {
       int n=companyService.updateCompanyInfo(company);
        if(n!=0){
            return "success";
        }else {
            return "error";
        }
    }
    //5、查询所有招聘信息(可复用）
    @RequestMapping(value = "/findallemp", method = RequestMethod.GET)
    public String findAllEmp() {
        List<Employment> list=companyService.findAllEmployment();
        return "success";
    }
    //6、发布招聘信息
    @RequestMapping(value = "/addemp", method = RequestMethod.PUT)
    public String addEmp(Employment employment) {
        int n=companyService.publishEmployment(employment);
        if(n!=0){
            return "success";
        }else {
            return "error";
        }
    }
    //7、修改招聘信息
    @RequestMapping(value = "/modemp/{empid}", method = RequestMethod.POST)
    public String modifyEmp(@PathVariable("empid") int empid,Employment employment) {
        int n=companyService.modEmployment(employment);
        if(n!=0){
            return "success";
        }else {
            return "error";
        }
    }
    //8、删除招聘信息
    @RequestMapping(value = "/delemp/{empid}", method = RequestMethod.DELETE)
    public String delEmp(@PathVariable("empid") int empid) {
        int n=companyService.delEmployment(empid);
        if(n!=0){
            return "success";
        }else {
            return "error";
        }
    }
    //9、查询本公司所有投递简历
    @RequestMapping(value = "/findcompallres/{companyid}", method = RequestMethod.GET)
    public String findCompAllResume(@PathVariable("companyid") int companyid) {
        List<Resume_Employment>  list=companyService.findAllReEmp(companyid);
        return "success";
    }
    //10、根据简历id查简历内容
    @RequestMapping(value = "/checkresume/{rid}", method = RequestMethod.GET)
    public String checkResume(@PathVariable("rid") int rid) {
        Resume resume=companyService.checkResume(rid);
        return "success";
    }
    //11、根据招聘信息id查招聘信息
    @RequestMapping(value = "/checkemp/{empid}", method = RequestMethod.GET)
    public String checkEmp(@PathVariable("empid") int empid) {
        Employment employment=companyService.checkEmployment(empid);
        return "success";
    }
    //12、修改简历状态
    @RequestMapping(value = "/modresstu/{empid}/{rid}", method = RequestMethod.POST)
    public String modifyResumeStatu(@PathVariable("empid") int empid,@PathVariable("rid") int rid,Resume_Employment resume_employment) {
       int n=companyService.modResumeStatus(resume_employment);
        return "success";
    }

    //13、退出登录
    @RequestMapping(value = "/exit/{companyid}")
    public String  exit(@PathVariable("companyid") int companyid,HttpServletRequest request){
        HttpSession session = request.getSession();
        session.removeAttribute("companyid");
        return "success";
    };


}
