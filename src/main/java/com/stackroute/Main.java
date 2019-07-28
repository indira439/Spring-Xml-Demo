package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        /**Using ApplicationContext*/
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        /**Looking Movie beans using ApplicationContext and print out actor information*/
        Movie movie1 = applicationContext.getBean("movie1", Movie.class);
        System.out.println(movie1);

        Movie movie2 = applicationContext.getBean("movie2", Movie.class);
        System.out.println(movie2);
        /**Look up same movie bean(movie2) again*/
        Movie movie2Dup = applicationContext.getBean("movie2", Movie.class);
        /**Equality result of two movie beans
         * Returns false if scope is defined to prototype else returns true*/
        System.out.println(movie2 == movie2Dup);

        Movie movie3 = applicationContext.getBean("movie3", Movie.class);
        System.out.println(movie3);

        /**Changed the id of Movie bean to name ="movieA, movieB" and trying to get Movie bean by it's 2 different values*/
        Movie movieA = applicationContext.getBean("movieA", Movie.class);
        System.out.println(movieA);
        Movie movieB = applicationContext.getBean("movieB", Movie.class);
        System.out.println(movieB);
    }
}
