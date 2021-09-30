package com.test.HelloWorldJar.browser;

import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.file.Paths;

@Service
public class Download {

    public File createTxt(){

        try{
            // Content in file
            String content = "Hello World";
            // Where file will be added - project folder
            String path= System.getProperty("user.dir").toString()+"/hello.txt";
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
            return file;
        } catch(IOException e){
            e.printStackTrace();
            return null;
        }
    }
}


