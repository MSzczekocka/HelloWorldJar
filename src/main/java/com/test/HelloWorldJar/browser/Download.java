package com.test.HelloWorldJar.browser;

import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class Download {

    public void createTxt(){
        try{
            // Content in file
            String content = "Hello World";
            // Where file will be added
            String path="C:\\test\\hello.txt";
            File file = new File(path);

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            // Write in file
            bw.write(content);

            // Close connection
            bw.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}


