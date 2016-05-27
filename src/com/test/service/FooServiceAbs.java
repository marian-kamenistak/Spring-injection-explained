package com.test.service;

import java.util.Set;

/**
 * Created by mkamenistak on 26.5.2016.
 */
public abstract class FooServiceAbs {

    public abstract Set<String> getDocumentFormats();

    public void work(){
        System.out.println(getDocumentFormats());
    }
}
