package com.ybl.entity;

import java.util.Date;

public class Admin_Company extends Admin_CompanyKey {
    private Integer auditCompany;

    private Date auditTime;

    public Integer getAuditCompany() {
        return auditCompany;
    }

    public void setAuditCompany(Integer auditCompany) {
        this.auditCompany = auditCompany;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }
}