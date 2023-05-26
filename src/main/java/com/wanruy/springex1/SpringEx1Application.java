package com.wanruy.springex1;

import com.wanruy.springex1.Controller.CollaborativeFilter;
import com.wanruy.springex1.Controller.ContentBasedFilter;
import com.wanruy.springex1.Controller.Movie;
import com.wanruy.springex1.Controller.MovieRecommender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SpringEx1Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringEx1Application.class, args);

        MovieRecommender bean2 = run.getBean(MovieRecommender.class);
        System.out.println(bean2);
        bean2.GetTheFile();

    }

}
