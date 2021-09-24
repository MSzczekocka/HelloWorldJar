package com.test.HelloWorldJar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;


public class DownloadTest {

    @Test
    public void fileExist(){
        boolean check = new File("C:\\test\\hello.txt").exists();
        Assertions.assertTrue(check);
    }
}
