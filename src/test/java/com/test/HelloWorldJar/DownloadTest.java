package com.test.HelloWorldJar;

import com.test.HelloWorldJar.browser.Download;
import com.test.HelloWorldJar.controller.HelloWorldController;
import lombok.RequiredArgsConstructor;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.io.File;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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

//    public File testDownload(){
//        Download download = new Download();
//        return download.createTxt();
//    }
}
