package com.wanruy.springex1.Controller;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@Scope("prototype")
public class MovieRecommender {
    Filter filter;
    @Value("${filmName}")
    String filmName;
    @Autowired
    MovieMapper movieMapper;
    @Resource
    private JdbcTemplate jdbcTemplate;
    @GetMapping("/movies")
    public List<Movie> getAllMovies(){
        String sql="select * from movie";
        return jdbcTemplate.query(sql,new MovieMapper());
    }
    @GetMapping("/movie/{id}")
    public List<Movie> getMovie(@PathVariable int id){
        String sql="select * from movie where id =?";
        return jdbcTemplate.query(sql,new MovieMapper(),new Object[]{id});
    }
    @GetMapping("delete/movie/{id}")
    public int deleteMovie(@PathVariable int id){
        String sql="delete from movie where id =?";
        return jdbcTemplate.update(sql,new Object[]{id});
    }
    public int InsertMovie(Movie movie){
        String sql="insert into movie(name,rating) values(?,?)";
        Object[] insert=new Object[]{movie.getName(),movie.getRating()};
        return jdbcTemplate.update(sql,insert);
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
    @GetMapping("/welcome")
    public String GetTheFile(){
        return "Welcome to Rui's REST API";
    }
}
