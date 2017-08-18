package com.mycompany.simplerequest;

import java.net.MalformedURLException;

/**
 *
 * @author redlongcity
 */

public class Run {
    
    public static void main(String[] params) throws MalformedURLException{
        SimpleRequest simpleRequest = new SimpleRequest();
        System.out.println(simpleRequest.getRequest(simpleRequest.getUrl().toString()));
    }
    
}
