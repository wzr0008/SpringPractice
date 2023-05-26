package com.wanruy.springex1;

import com.wanruy.springex1.Controller.CollaborativeFilter;
import com.wanruy.springex1.Controller.ContentBasedFilter;
import com.wanruy.springex1.Controller.Movie;
import com.wanruy.springex1.Controller.MovieRecommender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringEx1Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringEx1Application.class, args);
        Movie bean = run.getBean(Movie.class);
        Movie bean1 = run.getBean(Movie.class);
        System.out.println(bean);
        System.out.println(bean1);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//        MovieRecommender bean2 = run.getBean(MovieRecommender.class);
//        System.out.println(bean2);


    }

}
