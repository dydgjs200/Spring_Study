package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        test3();
    }

    //BeanFactory (3 버젼 아니면 사용하지 않음.. 권장되지 않음)
//    public static void test1(){
//        String filePath = "classpath:config/beans.xml";
//        ClassPathResource res = new ClassPathResource(filePath);
//        XmlBeanFactory factory = new XmlBeanFactory(res);
//    }
    
    //ApplicationContext = 패키지 내부
    public static void test3(){
        String filepath = "classpath:config/beans.xml";
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(filepath);

        ctx.close();
    }
}