package com.test.HelloWorldJar;

import com.test.HelloWorldJar.browser.Download;
import com.test.HelloWorldJar.controller.HelloWorldController;
import lombok.RequiredArgsConstructor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.io.File;


@RequiredArgsConstructor
public class DownloadTest {


    @Test
    public void fileExist(){
        boolean check = new File("C:\\test\\hello.txt").exists();
        Assertions.assertTrue(check);
    }

    @Test
    public void checkfile(){
        Download download = new Download();
        HelloWorldController helloWorldController = new HelloWorldController(download);
        helloWorldController.getDownload();
        Assertions.assertTrue(new File("C:\\test\\hello.txt").exists());
    }


}
