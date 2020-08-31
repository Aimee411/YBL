package com.ybl.entity;

public class Employment {
    private Integer empid;

    private Integer companyId;

    private String empask;

    private String empjob;

    private String empxueli;

    private String empaddress;

    private String emppay;

    private String empduty;

    private Integer isfulltime;

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getEmpask() {
        return empask;
    }

    public void setEmpask(String empask) {
        this.empask = empask == null ? null : empask.trim();
    }

    public String getEmpjob() {
        return empjob;
    }

    public void setEmpjob(String empjob) {
        this.empjob = empjob == null ? null : empjob.trim();
    }

    public String getEmpxueli() {
        return empxueli;
    }

    public void setEmpxueli(String empxueli) {
        this.empxueli = empxueli == null ? null : empxueli.trim();
    }

    public String getEmpaddress() {
        return empaddress;
    }

    public void setEmpaddress(String empaddress) {
        this.empaddress = empaddress == null ? null : empaddress.trim();
    }

    public String getEmppay() {
        return emppay;
    }

    public void setEmppay(String emppay) {
        this.emppay = emppay == null ? null : emppay.trim();
    }

    public String getEmpduty() {
        return empduty;
    }

    public void setEmpduty(String empduty) {
        this.empduty = empduty == null ? null : empduty.trim();
    }

    public Integer getIsfulltime() {
        return isfulltime;
    }

    public void setIsfulltime(Integer isfulltime) {
        this.isfulltime = isfulltime;
    }
}