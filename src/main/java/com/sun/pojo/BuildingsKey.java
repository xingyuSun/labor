package com.sun.pojo;

public class BuildingsKey {
    private Integer buildingsid;

    private String buildingsnum;

    public Integer getBuildingsid() {
        return buildingsid;
    }

    public void setBuildingsid(Integer buildingsid) {
        this.buildingsid = buildingsid;
    }

    public String getBuildingsnum() {
        return buildingsnum;
    }

    public void setBuildingsnum(String buildingsnum) {
        this.buildingsnum = buildingsnum == null ? null : buildingsnum.trim();
    }
}