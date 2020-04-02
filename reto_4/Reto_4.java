/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_4;

/**
 *
 * @author evely
 */
public class Reto_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int a=0, b=0, c=0, d=0 ; 
         
        System.out.println ("TABLAS DE MULTIPLICAR" ) ; 
        while (a <= 10) { 
            System.out.println ("LA TABLA DEL " +a) ; 
            b=1; 
            
            while (b <= 10) { 
                c= (a*b) ; 
                System.out.println (a+ " X " +b+ " = " +c ) ; 
                b++; 
            } 
            a++ ; 
            System.out.println () ; 
        } 
    }
    
}
