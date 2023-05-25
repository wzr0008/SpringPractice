package com.wanruy.springex1.Controller;

public class CollaborativeFilter implements Filter{
    @Override
    public String[] recommendMovies(String movie) {
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
