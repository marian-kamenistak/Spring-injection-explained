package com.test.model;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//@Lazy(true)
//@Scope("singleton")
@Component("documentFormatSingleton")
// is singleton by default
public class DocumentFormatsSingleton {

    public final Set<String> values = new HashSet<>(Arrays.asList("XML", "JSON"));


}
