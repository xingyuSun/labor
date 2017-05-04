package com.sun.pojo;

public class Role {
    private Integer roleid;

    private String rolename;

    private Integer rightsid;

    private String roleremarks;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public Integer getRightsid() {
        return rightsid;
    }

    public void setRightsid(Integer rightsid) {
        this.rightsid = rightsid;
    }

    public String getRoleremarks() {
        return roleremarks;
    }

    public void setRoleremarks(String roleremarks) {
        this.roleremarks = roleremarks == null ? null : roleremarks.trim();
    }
}