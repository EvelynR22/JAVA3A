/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_1;

import java.util.Scanner;

/**
 *
 * @author evely
 */
public class Reto_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=0, b=0, c=0, d=0;
        
        Scanner teclado=new Scanner (System.in);
        
        System.out.println("Digite primer nùmero");
        a=teclado.nextInt();
        System.out.println("Digite segundo nùmero");
        b=teclado.nextInt();
        System.out.println("Digite tercero nùmero");
        c=teclado.nextInt();
        System.out.println("Digite cuarto nùmero");
        d=teclado.nextInt();
        
        if(a>b && a>c && a>d){
            System.out.println("EL NUMERO MAYOR ES: "+a);
        }else if(b>a && b>c && b>d){
            System.out.println("EL NUMERO MAYOR ES: "+b);
        }else if(c>a && c>b && c>d){
            System.out.println("EL NUMERO MAYOR ES: "+c);    
        }else if(d>a && d>b && d>c){
            System.out.println("EL NUMERO MAYOR ES: "+d);   
        }  
    }
    
}
