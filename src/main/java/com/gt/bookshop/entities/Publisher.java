package com.gt.bookshop.entities;

/**
 * Created by GongTao on 2017/3/27 20:06.
 * 出版社实体类
 */
public class Publisher {

    // 出版社编号
    private int id;

    // 出版社名称
    private String name;

    // 属性的getter setter 方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Publisher(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Publisher(){}
}