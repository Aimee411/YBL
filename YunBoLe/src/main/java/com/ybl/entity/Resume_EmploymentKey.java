package com.ybl.entity;

public class Resume_EmploymentKey {
    private Integer rid;

    private Integer empid;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Resume_EmploymentKey(Integer rid, Integer empid) {
        this.rid = rid;
        this.empid = empid;
    }
}