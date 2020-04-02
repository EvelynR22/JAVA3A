/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_7;

import java.util.Scanner;

/**
 *
 * @author evely
 */
public class Reto_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int dado1=0, dado2=0;
        boolean a = false;
        
        do{
            System.out.println("POR FAVOR PRESIONE 1 PARA LANZAR LOS DADOS");
            teclado.nextInt();

            dado1 =(int)(Math.random()*3+1);
            dado2 =(int)(Math.random()*3+1);
            System.out.println("DADO 1 ::: "+dado1);
            System.out.println("DADO 2 ::: "+dado2);
           
            if(dado1==1 && dado2==1){
                a=true;
            }
        }while(a!=true);
       
        System.out.println("EL JUEGO TERMINO");
    }
    
}
