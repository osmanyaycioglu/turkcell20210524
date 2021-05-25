package com.training.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MyCache {

    private final List<String> strs = new ArrayList<>();

    public void add(final String str) {
        this.strs.add(str);
    }

}
