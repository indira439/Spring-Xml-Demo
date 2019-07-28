package com.stackroute;

/**
 * Implemented ApplicationContextAware, BeanFactoryAware, BeanNameAware in the
 * Movie class and printed their results.
 */

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        /**Using ApplicationContext*/
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        /**Close the applicationContext*/
        applicationContext.registerShutdownHook();


    }
}
