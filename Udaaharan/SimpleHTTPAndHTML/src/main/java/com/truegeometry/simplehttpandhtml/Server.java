/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truegeometry.simplehttpandhtml;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Manoj
 */
public class Server {
    
    public static void main(String... args){
    
        try {
            int port=8000;
            
            if(args.length==1){port=Integer.parseInt(args[0]);}
            HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
            server.createContext("/", new HTTPHandler());
            
            server.setExecutor(null); // creates a default executor
            server.start();
        
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
