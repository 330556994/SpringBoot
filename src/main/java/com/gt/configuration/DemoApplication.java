package com.gt.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 *  	查看初始化的 SpringBoot 新项目
 *  从项目目录可以看出整个项目结构遵循传统 Maven 或 Gradle 项目的布局，即主要应用程序代码位于 src/main/java 目录里。
 *  资源都放在 src/main/resources 目录里，测试代码在 src/test/resources 里。
 *  	其中项目中包含这些文件：
 *  		1. build.gradle: Gradle 构建说明文件
 *  		2. DemoApplication.java: 应用程序的启动引导类(boostrap class),也是主要的 Spring 配置类
 *  		3. DempApplicationTest.java: 一个基本的集成测试类。
 */




/**
 * 实际上 @SpringBootApplication 注解将三个有用的注解组合在了一起
 * 	1.Spring 的 @Configuration 注解，表明该类使用 Spring 基于 Java 的配置
 * 	2.Spring 的 @ComponentScan 注解，启用组件扫描，这样 Web 控制器类和其他组件才能被自动发现并注册为 Spring 应用程序上下文里的 bean
 * 	3.Spring Boot 的 @EnableAutoConfiguration 注解，就是这个注解开启了 Spring Boot 自动配置的魔力，可以减去成篇的配置
 */
@SpringBootApplication		//开启组件扫描和自动配置
public class DemoApplication {
	/**
	 * 这里的 Main 方法可以让我们在命令行里把该应用程序当做一个可执行 JAR 文件来运行， 这里向 SpringApplication.run() 传递里一个
	 * DempApplication类的引用，还有命令行参数，通过这些东西来启动应用程序
	 * 实际上 SpringBoot 应用程序即使一句代码也没有写，此时任然可以构建应用程序，要构建应用程序最简单的方式就是 Gradle 的 bootRun 任务：
	 * 		$ gradle bootRun
     */
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);			//负责启动和引导应用程序
	}
}
