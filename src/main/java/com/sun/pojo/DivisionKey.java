package com.sun.pojo;

public class DivisionKey {
    private Integer divisionid;

    private String divisionname;

    public Integer getDivisionid() {
        return divisionid;
    }

    public void setDivisionid(Integer divisionid) {
        this.divisionid = divisionid;
    }

    public String getDivisionname() {
        return divisionname;
    }

    public void setDivisionname(String divisionname) {
        this.divisionname = divisionname == null ? null : divisionname.trim();
    }
}