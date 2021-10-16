package com.library.po;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class LibBook {

    private long id;
    private String name;
    private long catId;
    private Date addTime;
    private String imgUrl;
    private long borrowedTimes;
    private String catName;
    private String status;
    private Long procureId;

    public Long getProcureId() {
        return procureId;
    }

    public void setProcureId(Long procureId) {
        this.procureId = procureId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public long getCatId() {
        return catId;
    }

    public void setCatId(long catId) {
        this.catId = catId;
    }

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }


    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }


    public long getBorrowedTimes() {
        return borrowedTimes;
    }

    public void setBorrowedTimes(long borrowedTimes) {
        this.borrowedTimes = borrowedTimes;
    }

}
