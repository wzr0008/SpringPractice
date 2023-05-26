package com.wanruy.springex1.Controller;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
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
    @PostConstruct
    public void postConstruct(){
        System.out.println("This is the ContentBasedFilter PostConstruct");
    }
    public ContentBasedFilter() {
        instances++;
        System.out.println("ContentBasedFilter constructor called");
    }

    public Movie getMovie() {
        return movie;
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("ContentBasedFilter preDestroy called");
    }
    public static int getInstances(){
        return ContentBasedFilter.instances;
    }
}
