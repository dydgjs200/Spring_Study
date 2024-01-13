package org.example;

import beans.TestBean;
import beans.TestBean2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String filepath = "classpath:config/beans.xml";
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(filepath);

        TestBean test1 = ctx.getBean("test1", TestBean.class);
        System.out.printf("test1 %s \n", test1);

        System.out.println("-----------------------");

        TestBean2 test2 = ctx.getBean("test2", TestBean2.class);
        System.out.printf("test2 %s \n", test2);

        ctx.close();        //testBean의 생명주기 종료
    }
}