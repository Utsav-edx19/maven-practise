package com.maven.helloWorld;

import org.apache.commons.lang3.RandomStringUtils;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello Random String : " + RandomStringUtils.randomAlphanumeric(10));
    }
}
