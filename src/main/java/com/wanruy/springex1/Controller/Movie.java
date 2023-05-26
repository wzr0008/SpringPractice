package com.wanruy.springex1.Controller;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Scope(value="prototype",proxyMode= ScopedProxyMode.TARGET_CLASS)
public class Movie {
    private static int instances = 0;
    int id;
    String name;
    double rating;
    public Movie(int id, String name, double rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    public Movie() {
        instances++;
        System.out.println("Movie defaulted constructor called");
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
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie [id=" + id + ", name=" + name + ", rating=" + rating + "]\n";
    }
}
