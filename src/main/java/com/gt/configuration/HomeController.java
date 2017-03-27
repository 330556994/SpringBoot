package com.gt.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by GongTao on 2017/3/26 20:51.
 */

/**
 * 在常规的 Spring 环境下，注入 properties 文件里的值得方式，通过 @PropertySource 指明 properties 文件的位置，然后通过 @Value
 * 注入值。在 Spring Boot 中，我们只需要在 application.properties 中定义属性，直接使用 @Value 注入即可
 */

@RestController
@RequestMapping("/")
public class HomeController {

    @Value("${book.author}")
    private String bookAuthor;

    @Value("${book.name}")
    private String bookName;

    @RequestMapping("/home")
    public String hello(){
        return "Spring Boot is OK Hello World"+bookAuthor+","+bookName;
    }
}
