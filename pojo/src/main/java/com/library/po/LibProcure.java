package com.library.po;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class LibProcure {

    private long id;
    private long num;
    private long catId;
    private Date proTime;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Date getProTime() {
        return proTime;
    }

    public void setProTime(Date proTime) {
        this.proTime = proTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }


    public long getCatId() {
        return catId;
    }

    public void setCatId(long catId) {
        this.catId = catId;
    }

}
