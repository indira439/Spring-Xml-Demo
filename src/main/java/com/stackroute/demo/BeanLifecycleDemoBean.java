package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("The afterPropertiesSet() is called by Spring to perform initialization ");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("The destroy() is called by Spring to perform clean up operations.");
    }

    public void customInit() {
        System.out.println("Method customInit invoked..");
    }

    public void customDestroy() {
        System.out.println("Method customDestroy invoked..");
    }
}
