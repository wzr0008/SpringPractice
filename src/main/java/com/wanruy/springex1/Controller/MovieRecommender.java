package com.wanruy.springex1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MovieRecommender {
    Filter filter;
    @Autowired
    public MovieRecommender(Filter filter){
        this.filter=filter;
    }
    public void GettheResult(String movie){
        String[] strings = this.filter.recommendMovies(movie);
        for(String str:strings){
            System.out.println(str);
        }
    }
}
