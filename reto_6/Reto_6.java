/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_6;

import java.util.Scanner;

/**
 *
 * @author evely
 */
public class Reto_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a=0, b=0, c=0, d=0, sumarP=0, sumarIm=0;
        Scanner entrada=new Scanner(System.in);
               
        System.out.println("INGRESE PRIMER NUMERO: ");
        a=entrada.nextInt();
        if(a%2==0 ){
            //System.out.println("ES NUMERO PAR: "+a);
            sumarP=sumarP+a;
        }else{
            sumarIm=sumarIm+a;
        }
        
        System.out.println("INGRESE SEGUNDO NUMERO: ");
        b=entrada.nextInt();
        if(b%2==0 ){
            //System.out.println("ES NUMERO PAR: "+b);
            sumarP=sumarP+b;
        }else{
            sumarIm=sumarIm+b;
        }
        
        System.out.println("INGRESE TERCER NUMERO: ");
        c=entrada.nextInt();
        if(c%2==0 ){
            //System.out.println("ES NUMERO PAR: "+c);
            sumarP=sumarP+c;
        }else{
            sumarIm=sumarIm+c;
        }
        
        System.out.println("INGRESE CUARTO NUMERO: ");
        d=entrada.nextInt();
        if(d%2==0 ){
            //System.out.println("ES NUMERO PAR: "+d);
            sumarP=sumarP+d;
        }else{
            sumarIm=sumarIm+d;
        }
        System.out.println("");
        
        if(a>b && a>c && a>d){
            System.out.println("EL NUMERO MAYOR ES::: "+a);
        }else if(b>a && b>c && b>d){
            System.out.println("EL NUMERO MAYOR ES::: "+b);
        }else if(c>a && c>b && c>d){
            System.out.println("EL NUMERO MAYOR ES::: "+c);    
        }else if(d>a && d>b && d>c){
            System.out.println("EL NUMERO MAYOR ES::: "+d);   
        }
        
        System.out.println("LOS NUMEROS PARES SON::: " +sumarP);
        System.out.println("LOS NUMEROS IMPARES SON::: " +sumarIm);
    }       
}
