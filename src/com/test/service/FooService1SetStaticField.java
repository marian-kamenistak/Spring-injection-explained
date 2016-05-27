package com.test.service;

import com.google.common.collect.ImmutableSet;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Service
public class FooService1SetStaticField extends FooServiceAbs {

    public static final Set<String> DOCUMENT_FORMATS2 = Collections.unmodifiableSet(new HashSet<>(Arrays.asList("XML", "JSON")));
    // or
    public static final Set<String> DOCUMENT_FORMATS = ImmutableSet.of("XML", "JSON"); // apply only if business-immutable

    @Override
    public Set<String> getDocumentFormats() {
        return DOCUMENT_FORMATS;
    }
}
