package com.test.HelloWorldJar;

import com.test.HelloWorldJar.browser.BrowserOpener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


@SpringBootApplication
public class HelloWorldJarApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(HelloWorldJarApplication.class, args);

		BrowserOpener browserOpener = new BrowserOpener();
		browserOpener.browse("http://localhost:8080/hello");

	}

}
