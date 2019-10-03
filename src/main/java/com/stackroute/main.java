package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class main {
    public static void main(String[] args){
    ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
        ((AbstractApplicationContext)context).registerShutdownHook();
//    Movie m1=(Movie)context.getBean("movieA");
//        Movie m2=(Movie)context.getBean("movieB");
//    m1.display();
//    m2.display();
        BeanLifecycleDemoBean obj=context.getBean("req",BeanLifecycleDemoBean.class);
    }

}
