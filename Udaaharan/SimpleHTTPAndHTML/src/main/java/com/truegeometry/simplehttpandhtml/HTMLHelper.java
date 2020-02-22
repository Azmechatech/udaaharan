/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truegeometry.simplehttpandhtml;

import j2html.TagCreator;
import static j2html.TagCreator.body;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.html;

/**
 *
 * @author Manoj
 */
public class HTMLHelper {
    
    public static String getHomePage(){
        return html(h1("This is header 1"),body("Body is here"),TagCreator.footer("And the footer")).render();
    
    }
}
