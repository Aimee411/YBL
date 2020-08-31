package com.ybl.entity;

public class Resume_Employment extends Resume_EmploymentKey {
    private String resumeStatus;

    public Resume_Employment(Integer rid, Integer empid) {
        super(rid, empid);
    }

    public String getResumeStatus() {
        return resumeStatus;
    }

    public void setResumeStatus(String resumeStatus) {
        this.resumeStatus = resumeStatus == null ? null : resumeStatus.trim();
    }


}