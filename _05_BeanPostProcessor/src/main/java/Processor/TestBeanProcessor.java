package Processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class TestBeanProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("After");

        switch (beanName){
            case "t1":
                System.out.println("id가 t1인 객체 생성");
                break;
            case "t2":
                System.out.println("id가 t2인 객체 생성");
                break;
        }
        return bean;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Before");
        return bean;
    }
}
