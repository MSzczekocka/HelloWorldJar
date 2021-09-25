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

            // FileWriter - class used for writing streams of characters.
            // getAbsoluteFile() - returns the absolute pathname of the given file object.
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            // BufferedWriter - provide for the efficient writing of single characters, arrays, and strings
            BufferedWriter bw = new BufferedWriter(fw);

            // Write content in file
            bw.write(content);

            // Close connection
            bw.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}


