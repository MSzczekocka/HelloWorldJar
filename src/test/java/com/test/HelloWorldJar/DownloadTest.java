package com.test.HelloWorldJar;

import com.test.HelloWorldJar.browser.Download;
import com.test.HelloWorldJar.controller.HelloWorldController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.File;

public class DownloadTest {
    Download download = new Download();
    HelloWorldController helloWorldController = new HelloWorldController(download);

    @Test
    public void checkfile(){
        helloWorldController.getDownload();
        Assertions.assertTrue(new File("C:\\test\\hello.txt").exists());
    }
}
