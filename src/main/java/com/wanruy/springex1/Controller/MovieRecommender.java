package com.wanruy.springex1.Controller;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
//@Scope("prototype")
public class MovieRecommender {
    Filter filter;
    @Value("${filmName}")
    String filmName;
    @GetMapping("/movies")
    public List<Movie> getAllMovies(){
        return Arrays.asList(new Movie(1, "Ice Age", 7.5),
                new Movie(2, "Happy Feet", 6.4),
                new Movie(3, "Shark Tales", 6.0),
        new Movie(4, "Terminator 2", 6.0),
                new Movie(4, "Terminator 2", 6.0));
    }
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
    @GetMapping("/movie")
    public String GetTheFile(){
        System.out.println(this.filmName);
        return this.filmName;
    }
}
