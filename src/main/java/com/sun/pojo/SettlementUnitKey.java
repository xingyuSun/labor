package com.sun.pojo;

public class SettlementUnitKey {
    private Integer settlementunitid;

    private String settlementunitname;

    public Integer getSettlementunitid() {
        return settlementunitid;
    }

    public void setSettlementunitid(Integer settlementunitid) {
        this.settlementunitid = settlementunitid;
    }

    public String getSettlementunitname() {
        return settlementunitname;
    }

    public void setSettlementunitname(String settlementunitname) {
        this.settlementunitname = settlementunitname == null ? null : settlementunitname.trim();
    }
}