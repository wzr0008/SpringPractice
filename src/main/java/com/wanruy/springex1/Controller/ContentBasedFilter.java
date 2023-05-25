package com.wanruy.springex1.Controller;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("content")
public class ContentBasedFilter implements Filter{
    @Override
    public String[] recommendMovies(String movie) {
        return new String[] {"M1", "M2", "M3"};
    }
}
