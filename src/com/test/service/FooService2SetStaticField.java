package com.test.service;

import com.google.common.collect.ImmutableSet;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class FooService2SetStaticField {

    public enum DOCUMENT_FORMATS_ENUM {
        XML, JSON
    }

    
}
