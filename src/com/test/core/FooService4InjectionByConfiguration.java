package com.test.core;

import com.test.model.DocumentFormatsSingleton;
import com.test.service.FooService4SetStaticFieldByConfigAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;


@Configuration //gets executed at Spring ApplicationContext construction time
public class FooService4InjectionByConfiguration {

    @Autowired
    private DocumentFormatsSingleton instanceToBeInjected;

    @PostConstruct
    public void doStaticInjection(){
        FooService4SetStaticFieldByConfigAnnotation.DOCUMENT_FORMATS = instanceToBeInjected;
    }
}
