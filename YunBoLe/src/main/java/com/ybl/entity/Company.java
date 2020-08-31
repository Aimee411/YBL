package com.ybl.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Company {
    private Integer companyId;

    private String companyPwd;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date creationTime;

    private String companyTel;

    private String companyAddress;

    private String companyMail;

    private String companyName;

    private String corporateWelfare;

    private String description;

    private String staffnumber;

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyPwd() {
        return companyPwd;
    }

    public void setCompanyPwd(String companyPwd) {
        this.companyPwd = companyPwd == null ? null : companyPwd.trim();
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public String getCompanyTel() {
        return companyTel;
    }

    public void setCompanyTel(String companyTel) {
        this.companyTel = companyTel == null ? null : companyTel.trim();
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress == null ? null : companyAddress.trim();
    }

    public String getCompanyMail() {
        return companyMail;
    }

    public void setCompanyMail(String companyMail) {
        this.companyMail = companyMail == null ? null : companyMail.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCorporateWelfare() {
        return corporateWelfare;
    }

    public void setCorporateWelfare(String corporateWelfare) {
        this.corporateWelfare = corporateWelfare == null ? null : corporateWelfare.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getStaffnumber() {
        return staffnumber;
    }

    public void setStaffnumber(String staffnumber) {
        this.staffnumber = staffnumber == null ? null : staffnumber.trim();
    }
}