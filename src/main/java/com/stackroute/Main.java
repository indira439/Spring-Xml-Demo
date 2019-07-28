package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {

        /**Using ApplicationContext*/
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//
//        Movie movie = applicationContext.getBean("movie",Movie.class);
//        System.out.println(movie);


        /**Using XmlBeanFactory*/
        Resource resource = new FileSystemResource("src/main/resources/beans.xml");
        XmlBeanFactory beanFactory = new XmlBeanFactory(resource);

        Movie movie = beanFactory.getBean("movie", Movie.class);
        System.out.println(movie);


        /**Using Spring 3.2 BeanDefinitionRegistry and BeanDefinitionReader*/
//        BeanDefinitionRegistry beanDefinitionRegistry= new BeanDefinitionRegistry("beans.xml");
//beanDefinitionRegistry.getBeanDefinition("beans.xml");
    }
}
