package com.wanruy.springex1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.swing.text.AbstractDocument;

@Component("content")
public class ContentBasedFilter implements Filter{
    @Override
    public String[] recommendMovies(String movie) {
        return new String[] {"M1", "M2", "M3"};
    }
    private static int instances= 0;

    @Autowired
    private Movie movie;

    public ContentBasedFilter() {
        instances++;
        System.out.println("CollaborativeFilter constructor called");
    }

    public Movie getMovie() {
        return movie;
    }

    public static int getInstances(){
        return ContentBasedFilter.instances;
    }
}
