package com.test.service;

import com.google.common.collect.ImmutableSet;
import com.test.model.DocumentFormatsSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Set;

@Service
public class FooService5AsSpringSingletonComponent extends FooServiceAbs  {

    @Autowired
    private DocumentFormatsSingleton documentFormats;
    // autowire singleton on instance

    @Override
    public Set<String> getDocumentFormats() {
        return documentFormats.values;
    }
}
