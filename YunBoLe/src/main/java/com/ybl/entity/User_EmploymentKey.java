package com.ybl.entity;

public class User_EmploymentKey {
    private Integer userid;

    private Integer empid;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public User_EmploymentKey(Integer userid, Integer empid) {
        this.userid = userid;
        this.empid = empid;
    }
}