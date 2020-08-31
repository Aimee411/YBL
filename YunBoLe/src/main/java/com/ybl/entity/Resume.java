package com.ybl.entity;

public class Resume {
    private Integer rid;

    private Integer userid;

    private String rname;

    private String rsex;

    private String rxueli;

    private String rtel;

    private String remail;

    private String raddress;

    private String rpolsta;

    private String reduexp;

    private String rperskills;

    private String others;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    public String getRsex() {
        return rsex;
    }

    public void setRsex(String rsex) {
        this.rsex = rsex == null ? null : rsex.trim();
    }

    public String getRxueli() {
        return rxueli;
    }

    public void setRxueli(String rxueli) {
        this.rxueli = rxueli == null ? null : rxueli.trim();
    }

    public String getRtel() {
        return rtel;
    }

    public void setRtel(String rtel) {
        this.rtel = rtel == null ? null : rtel.trim();
    }

    public String getRemail() {
        return remail;
    }

    public void setRemail(String remail) {
        this.remail = remail == null ? null : remail.trim();
    }

    public String getRaddress() {
        return raddress;
    }

    public void setRaddress(String raddress) {
        this.raddress = raddress == null ? null : raddress.trim();
    }

    public String getRpolsta() {
        return rpolsta;
    }

    public void setRpolsta(String rpolsta) {
        this.rpolsta = rpolsta == null ? null : rpolsta.trim();
    }

    public String getReduexp() {
        return reduexp;
    }

    public void setReduexp(String reduexp) {
        this.reduexp = reduexp == null ? null : reduexp.trim();
    }

    public String getRperskills() {
        return rperskills;
    }

    public void setRperskills(String rperskills) {
        this.rperskills = rperskills == null ? null : rperskills.trim();
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others == null ? null : others.trim();
    }
}