package com.test.service;

import com.test.model.DocumentFormatsSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class FooService3SetStaticField extends FooServiceAbs  {

    @Autowired
    public static DocumentFormatsSingleton DOCUMENT_FORMATS; // as singleton component
    // not working on static field, moreover, it would be initialized only when Service has been evoked
    //remove static

    @Override
    public Set<String> getDocumentFormats() {
        return DOCUMENT_FORMATS != null ? DOCUMENT_FORMATS.values : null;
    }
}
