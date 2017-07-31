package com.ivan.duboo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 描述：
 *
 * @auth mrz
 * @mail 617071233@qq.com
 * @create 2017/7/29 10:44
 */
public class ServerMain {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "spring-registry.xml","spring-mybatis.xml"});
        context.start();

        System.in.read(); // 按任意键退出
    }
}
