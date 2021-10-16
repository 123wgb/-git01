package com.library.vo;

import com.library.po.LibStu;

public class StuVo extends LibStu {
    private Long times;
    private String noReturn;

    public Long getTimes() {
        return times;
    }

    public void setTimes(Long times) {
        this.times = times;
    }

    public String getNoReturn() {
        return noReturn;
    }

    public void setNoReturn(String noReturn) {
        this.noReturn = noReturn;
    }
}
