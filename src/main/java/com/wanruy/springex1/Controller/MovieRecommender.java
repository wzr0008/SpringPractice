package com.wanruy.springex1.Controller;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class MovieRecommender {
    Filter filter;
    @Value("${filterName}")
    String filterName;
    @Autowired
    public MovieRecommender(@Qualifier("collaborative") Filter filter){
        this.filter=filter;
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println("The Movie's Post Construct is created");
    }
    public void GettheResult(String movie){
        String[] strings = this.filter.recommendMovies(movie);
        for(String str:strings){
            System.out.println(str);
        }
    }
}
