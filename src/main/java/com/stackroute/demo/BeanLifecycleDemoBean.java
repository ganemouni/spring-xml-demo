package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean method has been called");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Disposable method has been called");

    }
    public void customInit(){
        System.out.println("Initialisation is done");

    }
    public void customDestroy(){
        System.out.println("Destroyed");
    }
}
