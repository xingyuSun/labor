package com.sun.pojo;

public class Rights {
    private Integer rightsid;

    private String rightsname;

    public Integer getRightsid() {
        return rightsid;
    }

    public void setRightsid(Integer rightsid) {
        this.rightsid = rightsid;
    }

    public String getRightsname() {
        return rightsname;
    }

    public void setRightsname(String rightsname) {
        this.rightsname = rightsname == null ? null : rightsname.trim();
    }
}