/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_2;

import java.util.Scanner;

/**
 *
 * @author evely
 */
public class Reto_2 {

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
        
        if(a==b && a==c && a==d && b==c && b==d && c==d){
            System.out.println("LOS NUMEROS SON: "+a+b+c+d);   
        }
    }
    
}
