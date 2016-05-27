package com.test.service;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class FooService0SetStaticField extends FooServiceAbs {

    public static final Set<String> DOCUMENT_FORMATS = new HashSet<>(); // can be list

    static {
        // static block init :-(
        DOCUMENT_FORMATS.add("XML");
        DOCUMENT_FORMATS.add("JSON");
    }

    @Override
    public Set<String> getDocumentFormats() {
        return DOCUMENT_FORMATS;
    }
}
