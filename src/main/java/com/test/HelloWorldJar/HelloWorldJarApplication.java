package com.test.HelloWorldJar;

import com.test.HelloWorldJar.browser.BrowserOpener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldJarApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldJarApplication.class, args);
        BrowserOpener.browse("http://localhost:8080/hello");

        String currentWorkingDir = System.getProperty("user.dir");
        System.out.println(currentWorkingDir);
    }
}

//Advice controller
