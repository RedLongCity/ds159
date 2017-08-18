package com.mycompany.simplerequest;

import com.mycompany.utils.HttpUtils;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author redlongcity
 */

public class SimpleRequest implements SimpleRequestConstants {
    
    URL url;
    
    public SimpleRequest() throws MalformedURLException{
        url = new URL("http://api.ittour.com.ua/module/params/318?entity=hotel:meal_type:from_city");
    }
    
    public String getRequest(String url){
        String content = null;
        try {
             content = HttpUtils.getRequest(url).
                    asString(StandardCharsets.UTF_8);
        } catch (IOException ex) {
            Logger.getLogger(SimpleRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return content;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }
    
    
    
}
