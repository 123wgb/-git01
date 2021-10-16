package com.library.vo;

import com.library.po.LibCat;

public class CatVo extends LibCat {
    private Long books;

    public Long getBooks() {
        return books;
    }

    public void setBooks(Long books) {
        this.books = books;
    }
}
