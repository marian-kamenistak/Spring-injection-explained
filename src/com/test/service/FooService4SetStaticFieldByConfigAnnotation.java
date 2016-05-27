package com.test.service;

import com.test.model.DocumentFormatsSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class FooService4SetStaticFieldByConfigAnnotation extends FooServiceAbs  {

    public static DocumentFormatsSingleton DOCUMENT_FORMATS; // injected by FooService4InjectionByConfiguration

    @Override
    public Set<String> getDocumentFormats() {
        return DOCUMENT_FORMATS != null ? DOCUMENT_FORMATS.values : null;
    }
}
