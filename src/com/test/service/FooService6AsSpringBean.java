package com.test.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

@Service
public class FooService6AsSpringBean extends FooServiceAbs {

    @Resource(name= "documentFormatSpringBean") //defined in SpringConfig as @Bean
    private Set<String> documentFormats;

    @Override
    public Set<String> getDocumentFormats() {
        return documentFormats;
    }
}
