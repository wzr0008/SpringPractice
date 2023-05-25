package com.wanruy.springex1.Controller;

import org.springframework.stereotype.Component;

@Component("collaborative")
public class CollaborativeFilter implements Filter{
    @Override
    public String[] recommendMovies(String movie) {
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
