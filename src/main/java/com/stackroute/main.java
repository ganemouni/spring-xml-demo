package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class main {
    public static void main(String[] args){
    ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
//        BeanFactory factory= new XmlBeanFactory(new ClassPathResource("bean.xml"));

    Movie m1=(Movie)context.getBean("movieA");
        Movie m2=(Movie) context.getBean("movieB");
    m1.display();
    m2.display();

        if (m1 == m2) {
            System.out.println(m1==m2);
        }
        else{
            System.out.println("not equal");
        }
    }

}
