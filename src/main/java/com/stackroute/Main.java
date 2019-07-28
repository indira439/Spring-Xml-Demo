package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        /**Using ApplicationContext*/
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        /**Looking Movie beans using ApplicationContext and print out actor information*/
//        Movie movie = applicationContext.getBean("movie", Movie.class);
//        System.out.println(movie);


        //If we set autoWire to byType it will throw following exception
        /**Exception in thread "main" org.springframework.beans.factory.BeanCreationException:
         * Error creating bean with name 'movie' defined in class path resource [beans.xml]: Instantiation of bean failed;
         * nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [com.stackroute.domain.Movie]:
         * No default constructor found;
         * nested exception is java.lang.NoSuchMethodException: com.stackroute.domain.Movie.<init>()
         */

        //Set autoWire to constructor
        Movie movie = applicationContext.getBean("movie", Movie.class);
        System.out.println(movie);

    }
}
