package com.test.HelloWorldJar;

import com.test.HelloWorldJar.browser.Download;
import com.test.HelloWorldJar.controller.HelloWorldController;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import java.io.File;

import static junit.framework.TestCase.assertTrue;

@RequiredArgsConstructor
public class DownloadTest {

    @Test
    public void fileExist(){
        boolean check = new File("C:\\test\\hello.txt").exists();
        Assertions.assertTrue(check);
    }
}
