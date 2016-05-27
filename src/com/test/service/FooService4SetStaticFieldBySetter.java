package com.test.service;

import com.test.model.DocumentFormatsSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class FooService4SetStaticFieldBySetter extends FooServiceAbs  {

    public static DocumentFormatsSingleton DOCUMENT_FORMATS;

    @Autowired // setter injection works on static field, however, better to avoid
    public void setDocumentFormats(DocumentFormatsSingleton inst){
        this.DOCUMENT_FORMATS = inst;
    }

    @Override
    public Set<String> getDocumentFormats() {
        return DOCUMENT_FORMATS != null ? DOCUMENT_FORMATS.values : null;
    }
}
