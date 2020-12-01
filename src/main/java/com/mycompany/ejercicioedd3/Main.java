/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioedd3;

import java.util.Scanner;

/**
 *
 * @author Oscar Llamas Parra
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangle triangleUser = new Triangle();
        
        System.out.println("¿Cuál es la altura del triángulo?");
        //alt+enter shows hint for import Scanner
        Scanner reader = new Scanner(System.in);
        triangleUser.setHeight(reader.nextFloat());
        System.out.println("¿Cuál es la base del triángulo?");
        reader = new Scanner(System.in);
        triangleUser.setBase(reader.nextFloat());
        /**
         * ctrl+hover on "setBase" shows the location of the method and its
         * components.
         * ctrl+click directs to the method
         * alt+left arrow for going back
         */
        System.out.println("El área del triángulo introducido por el usuario es:"+triangleUser.calculateArea());
        
        Triangle triangleSystem = new Triangle(5,6);
        
        System.out.println("El área del triángulo del sistema es:"+triangleSystem.calculateArea());
    }
    
}
