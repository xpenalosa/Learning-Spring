/*
 * Copyright (c) 2020 github.com/xpenalosa. Check COPYRIGHT file for usage permissions.
 */

package com.learn_spring.demo.helloworld.rest;

public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}