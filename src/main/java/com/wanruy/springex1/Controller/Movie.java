package com.wanruy.springex1.Controller;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype",proxyMode= ScopedProxyMode.TARGET_CLASS)
public class Movie {
    private static int instances = 0;

    private int id;
    private String name;
    private String genre;
    private String producer;

    public Movie() {
        instances++;
        System.out.println("Movie constructor called");
    }
    @PostConstruct
    private void postConstruct() {
        //initialization code
        System.out.println("In Movie postConstruct method");
    }
    @PreDestroy
    private void preDestroy() {
        //cleanup code
        System.out.println("In Movie preDestroy method");
    }
    public static int getInstances() {
        return Movie.instances;
    }
}
