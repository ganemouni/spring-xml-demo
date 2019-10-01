package com.stackroute;

import com.stackroute.domain.Actor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class main {
    public static void main(String[] args){
//    ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
        BeanFactory factory= new XmlBeanFactory(new ClassPathResource("bean.xml"));

    Actor a1=(Actor)factory.getBean("Actor1");
    a1.display();
    }

}
