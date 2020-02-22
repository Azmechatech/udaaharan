/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truegeometry.simplehttpandhtml;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author Manoj
 */
public class HTTPHandler  implements HttpHandler  {

    @Override
    public void handle(HttpExchange he) throws IOException {
        byte[] result=HTMLHelper.getHomePage().getBytes();
         he.sendResponseHeaders(200, result.length);
        OutputStream os = he.getResponseBody();
        os.write(result);
        os.close();
    }
    
}
