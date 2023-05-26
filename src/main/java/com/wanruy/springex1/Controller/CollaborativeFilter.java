package com.wanruy.springex1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("collaborative")
public class CollaborativeFilter implements Filter{
    private static int instances= 0;

    @Autowired
    private Movie movie;

    public CollaborativeFilter() {
        instances++;
        System.out.println("CollaborativeFilter constructor called");
    }

    public Movie getMovie() {
        return movie;
    }

    public static int getInstances(){
        return CollaborativeFilter.instances;
    }

    @Override
    public String[] recommendMovies(String movie) {
        return new String[0];
    }
}
