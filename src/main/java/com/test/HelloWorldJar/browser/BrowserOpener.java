package com.test.HelloWorldJar.browser;


import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class BrowserOpener {


    public static void browse(String url) {
//  Desktop - class from package java.awt.
//    Supported operations include:
//      launching the user-default browser to show a specified URI;
//      launching the user-default mail client with an optional mailto URI;
//      launching a registered application to open, edit or print a specified file.
//  isDesktopSupported() - tests whether this class is supported on the current platform.
        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
//  browse() - Launches the default browser to display a URI.
            try {
                desktop.browse(new URI(url));
//  IOException - Signals that an I/O exception of some sort has occurred.
//  URISyntaxException - Checked exception thrown to indicate that a string could not be parsed as a URI reference.
//  printStackTrace() - prints the throwable along with other details like the line number and class name where the exception occurred.
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        }else{
//  Runtime - allows the application to interface with the environment in which the application is running.
//  getRuntime() - returns the runtime object associated with the current Java application.
            Runtime runtime = Runtime.getRuntime();
            try {
//  exec - executes the specified string command in a separate process.
//  rundll32 url.dll - execute 32-bit DLL file
//  DLL file -  Microsoft's implementation of the shared library
                runtime.exec("rundll32 url.dll,FileProtocolHandler " + url);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
