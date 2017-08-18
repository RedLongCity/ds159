package com.mycompany.simplerequest;

import java.io.IOException;
import java.net.MalformedURLException;

/**
 *
 * @author redlongcity
 */

public class Run {
    
    public static void main(String[] params) throws MalformedURLException{
        SimpleRequest simpleRequest = new SimpleRequest();
        System.out.println(simpleRequest.getRequest("https://api.ittour.com.ua/module/params/destinations?type=1&query=fra"));
    }
    
}
