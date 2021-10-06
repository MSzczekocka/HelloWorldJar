package com.test.HelloWorldJar.controller;

import com.test.HelloWorldJar.browser.Download;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class HelloWorldController {
    private final Download download;

    public HelloWorldController(Download download) {
        this.download = download;
    }

    @GetMapping("/hello")
    @ResponseBody
    public String getDownloadButton() {
        return "<a href=http://localhost:8080/hello-txt> download </a>";
    }

    @GetMapping("/hello-txt")
    @ResponseBody
    public String getDownload() {
        try {
            download.createTxt();
            return "Downloaded";
        } catch (IOException e) {
            return e.getMessage();
        }
    }
}
