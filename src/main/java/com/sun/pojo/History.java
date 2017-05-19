package com.sun.pojo;

public class History {
    private Integer historyid;

    private String historytime;

    private Integer taskbookid;

    private String historyor;

    public Integer getHistoryid() {
        return historyid;
    }

    public void setHistoryid(Integer historyid) {
        this.historyid = historyid;
    }

    public String getHistorytime() {
        return historytime;
    }

    public void setHistorytime(String historytime) {
        this.historytime = historytime == null ? null : historytime.trim();
    }

    public Integer getTaskbookid() {
        return taskbookid;
    }

    public void setTaskbookid(Integer taskbookid) {
        this.taskbookid = taskbookid;
    }

    public String getHistoryor() {
        return historyor;
    }

    public void setHistoryor(String historyor) {
        this.historyor = historyor == null ? null : historyor.trim();
    }
}