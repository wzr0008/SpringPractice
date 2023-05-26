package com.wanruy.springex1.Controller;

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
    public void GettheResult(String movie){
        String[] strings = this.filter.recommendMovies(movie);
        for(String str:strings){
            System.out.println(str);
        }
    }
}
