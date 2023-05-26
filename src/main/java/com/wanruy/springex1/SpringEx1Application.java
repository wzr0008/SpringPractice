package com.wanruy.springex1;

import com.wanruy.springex1.Controller.CollaborativeFilter;
import com.wanruy.springex1.Controller.Movie;
import com.wanruy.springex1.Controller.MovieRecommender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringEx1Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringEx1Application.class, args);
        CollaborativeFilter filter= run.getBean(CollaborativeFilter.class);
        System.out.println("\nContentBasedFilter bean with singleton scope");
        System.out.println(filter);

        //Retrieve prototype bean from the singleton bean thrice
        Movie movie1 = filter.getMovie();
        Movie movie2 = filter.getMovie();
        Movie movie3 = filter.getMovie();

        System.out.println("\nMovie bean with prototype scope");
        System.out.println(movie1);
        System.out.println(movie2);
        System.out.println(movie3);


    }

}
