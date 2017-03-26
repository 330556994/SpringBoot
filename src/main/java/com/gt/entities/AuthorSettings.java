package com.gt.entities;

/**
 * Created by GongTao on 2017/3/26 21:58.
 */

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 创建类型安全的 Bean
 */

@Component
@ConfigurationProperties(prefix="book")
public class AuthorSettings {

    private String name;
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
