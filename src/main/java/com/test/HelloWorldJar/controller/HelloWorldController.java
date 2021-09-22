package com.test.HelloWorldJar.controller;


import com.test.HelloWorldJar.browser.Download;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class HelloWorldController {

    private final Download download;

    @GetMapping("/hello")
    @ResponseBody
    public String getDownloadButton(){
        return "<a href=http://localhost:8080/hello-txt> download </a>";
    }

    @GetMapping("/hello-txt")
    @ResponseBody
    public String getDownload(){
        download.createTxt();
        return "Downloaded";
    }

}
