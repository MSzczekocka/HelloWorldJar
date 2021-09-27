package com.test.HelloWorldJar;

import com.test.HelloWorldJar.browser.Download;
import com.test.HelloWorldJar.controller.HelloWorldController;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.io.File;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class DownloadTest {


    @Test
    public void fileExist(){
        boolean check = new File("C:\\test\\hello.txt").exists();
        Assertions.assertTrue(check);
    }

    @Test
    public void checkfile(){
        HelloWorldController helloWorldController = mock(HelloWorldController.class);
        when(helloWorldController.getDownload()).thenReturn(testDownload());
        Assert.assertEquals(helloWorldController.getDownload(),"Downloaded");
        boolean check = new File("C:\\test\\hello.txt").exists();
        Assertions.assertTrue(check);
    }

    public String testDownload(){
        Download download = mock(Download.class);
        download.createTxt();
        return "Downloaded";
    }
}
