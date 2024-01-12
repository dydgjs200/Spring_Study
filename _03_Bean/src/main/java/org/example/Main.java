package org.example;

import beans.TestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String filepath = "classpath:config/beans.xml";
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(filepath);

        //id가 test1인 빈객체
        TestBean t1 = ctx.getBean("test1", TestBean.class);
        System.out.printf("t1 : %s\n", t1);

        TestBean t2 = ctx.getBean("test1", TestBean.class);
        System.out.printf("t2 : %s\n", t2);

        TestBean t3 = ctx.getBean("test3", TestBean.class);
        System.out.printf("t3 : %s\n", t3);

        ctx.close();


    }
}