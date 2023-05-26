package com.wanruy.springex1.Controller;

import org.springframework.stereotype.Indexed;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Indexed
public @interface RuiService {
    String value() default "曾鹏 你个傻逼玩意";
}
