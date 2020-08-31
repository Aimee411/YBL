package com.ybl.controller;

import com.ybl.entity.*;
import com.ybl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    UserService userService;


    //1、登录(可复用）
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String userLogin(int userid, String userpwd, HttpServletRequest request) {
        User user = userService.login(userid);
        HttpSession session = request.getSession();
        if (user != null && user.getUserpwd() == userpwd) {
            //验证码
            //本地存储用户
            session.setAttribute("userid", userid);
            return "success";
        } else {
            return "error";
        }
    }

    //2、注册(可复用）
    @RequestMapping(value = "/regist", method = RequestMethod.PUT)
    public String userRegist(User user) {
        System.out.println("注册公司");
        int n = userService.regist(user);
        System.out.println(n);
        return "user/success";
    }

    //3、注销(可复用）
    @RequestMapping(value = "/logout/{uid}", method = RequestMethod.DELETE)
    public String userLogout(@PathVariable("uid") int uid) {
        int n = userService.logout(uid);
        if (n != 0) {
            return "success";
        } else {
            return "error";
        }

    }

    //4、查询所有招聘信息(可复用）
    @RequestMapping(value = "/findallemp", method = RequestMethod.GET)
    public String findAllEmp() {
        List<Employment> list = userService.findAllEmpment();
        return "success";
    }

    //5、查询所有收藏的招聘信息id(User_Employment表）
    @RequestMapping(value = "/findcollemp/{uid}", method = RequestMethod.GET)
    public String findColleEmp(@PathVariable("uid") int uid) {
        List<Employment> list = userService.findAllUserCollEmp(uid);
        return "success";
    }

    //6、收藏招聘信息
    @RequestMapping(value = "/collemp/{uid}/{empid}", method = RequestMethod.GET)
    public String collEmp(@PathVariable("uid") int uid, @PathVariable("empid") int empid) {
        User_Employment user_employment = new User_Employment(uid, empid);
        int n = userService.collectEmp(user_employment);
        if (n != 0) {
            return "success";
        } else {
            return "error";
        }

    }

    //取消收藏招聘信息
    @RequestMapping(value = "/cancelcollemp/{uid}/{empid}", method = RequestMethod.GET)
    public String cancelCollEmp(@PathVariable("uid") int uid, @PathVariable("empid") int empid) {
        User_Employment user_employment = new User_Employment(uid, empid);
        int n = userService.cancelCollectEmp(user_employment);
        if (n != 0) {
            return "success";
        } else {
            return "error";
        }

    }

    //7、修改个人信息或密码
    @RequestMapping(value = "/moduserinfo/{uid}", method = RequestMethod.POST)
    public String modifyUser(@PathVariable("uid") int uid, User user) {
        int n = userService.updateUserInfo(user);
        if (n != 0) {
            return "success";
        } else {
            return "error";
        }
    }

    //8、查询自己的所有简历
    @RequestMapping(value = "/finduserallres/{uid}", method = RequestMethod.GET)
    public String findUserAllRes(@PathVariable("uid") int uid) {
        List<Resume> list = userService.findAllResume(uid);
        return "success";
    }

    //9、查询简历投递记录以及结果（首先找到我的简历，然后根据简历id查找投递记录）
    @RequestMapping(value = "/finddeliver/{uid}", method = RequestMethod.GET)
    public String findDeliver(@PathVariable("uid") int uid) {
        List<Resume_Employment> list1 = userService.findDeliverResume(uid);//可查询到简历结果
        //还可查看简历内容 可应用别的方法
        return "success";
    }

    //10、添加简历
    @RequestMapping(value = "/addresume", method = RequestMethod.PUT)
    public String addResume(Resume resume) {
        int n = userService.addResume(resume);
        if (n != 0) {
            return "success";
        } else {
            return "error";
        }
    }

    //11、修改简历
    @RequestMapping(value = "/modres/{rid}", method = RequestMethod.POST)
    public String modifyRes(@PathVariable("rid") int rid, Resume resume) {
        int n = userService.updateResume(resume);
        if (n != 0) {
            return "success";
        } else {
            return "error";
        }
    }

    //12、投递简历(找到自己的简历id，然后找到职位id 添加一条记录）
    @RequestMapping(value = "/deliverresume/{rid}/{empid}", method = RequestMethod.PUT)
    public String deliverResume(@PathVariable("rid") int rid, @PathVariable("empid") int empid) {
        Resume_Employment resumeEmployment = new Resume_Employment(rid, empid);
        int n = userService.deliverResume(resumeEmployment);
        if (n != 0) {
            return "success";
        } else {
            return "error";
        }
    }

    //13、删除某个简历
    @RequestMapping(value = "/deleres/{rid}", method = RequestMethod.DELETE)
    public String delRes(@PathVariable("rid") int rid) {
        int n = userService.delResume(rid);
        if (n != 0) {
            return "success";
        } else {
            return "error";
        }
    }
}
