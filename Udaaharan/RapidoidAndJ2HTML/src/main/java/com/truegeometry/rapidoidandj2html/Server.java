/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truegeometry.rapidoidandj2html;

import j2html.TagCreator;
import static j2html.TagCreator.body;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.html;
import org.rapidoid.setup.On;

/**
 *
 * @author Manoj
 */
public class Server {
    public static void main(String... args){
        On.get("/").html(html(h1("This is header 1"),body("Body is here"),TagCreator.footer("And the footer")).render());
    }
}
