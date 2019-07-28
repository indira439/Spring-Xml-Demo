package com.stackroute;

/**
 * Implemented ApplicationContextAware, BeanFactoryAware, BeanNameAware in the
 * Movie class and printed their results.
 */

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        /**Using ApplicationContext*/
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        Movie movie = applicationContext.getBean("movie", Movie.class);
        System.out.println(movie);
    }
}
