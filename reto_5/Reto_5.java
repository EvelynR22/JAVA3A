/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_5;

import java.util.Scanner;

/**
 *
 * @author evely
 */
public class Reto_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int  i=1, tabla=0, lim=0; 
        Scanner teclado=new Scanner (System.in);
        
        System.out.println ("QUE NUMERO DE TABLA DE MULTIPLICAR" ) ; 
        tabla=teclado.nextInt();
        System.out.println ("DIGITE NUMERO LÌMITE DE SERIE A MOSTRAR" ) ; 
        lim=teclado.nextInt();
        
        i+=1;
        for (i=1; i<lim+1; i++){
            System.out.println(tabla + " X " + i+ " = " + tabla*i);
            
        }
    }
    
}
