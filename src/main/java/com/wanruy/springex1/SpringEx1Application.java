package com.wanruy.springex1;

import com.wanruy.springex1.Controller.MovieRecommender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringEx1Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringEx1Application.class, args);
        MovieRecommender bean = run.getBean(MovieRecommender.class);
        bean.GettheResult("ni hao");

    }

}
