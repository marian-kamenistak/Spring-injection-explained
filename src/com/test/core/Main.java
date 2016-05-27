package com.test.core;

import com.test.service.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        FooServiceAbs fooService = ctx.getBean(FooService5AsSpringSingletonComponent.class);
        fooService.work();
    }
}
