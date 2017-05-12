package com.sun.pojo;

public class WorkProject {
    private String workprojectparts;

    private String unitname;

    private String workprojectremarks;

    private Integer workprojectid;

    private String workprojectname;

    public Integer getWorkprojectid() {
        return workprojectid;
    }

    public void setWorkprojectid(Integer workprojectid) {
        this.workprojectid = workprojectid;
    }

    public String getWorkprojectname() {
        return workprojectname;
    }

    public void setWorkprojectname(String workprojectname) {
        this.workprojectname = workprojectname == null ? null : workprojectname.trim();
    }
    
    public String getWorkprojectparts() {
        return workprojectparts;
    }

    public void setWorkprojectparts(String workprojectparts) {
        this.workprojectparts = workprojectparts == null ? null : workprojectparts.trim();
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    public String getWorkprojectremarks() {
        return workprojectremarks;
    }

    public void setWorkprojectremarks(String workprojectremarks) {
        this.workprojectremarks = workprojectremarks == null ? null : workprojectremarks.trim();
    }
}