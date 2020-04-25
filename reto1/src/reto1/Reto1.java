/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;

import java.util.Scanner;

/**
 *
 * @author evely
 */
public class Reto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        // ENTRADA DE UNA CADENA
        int newNumber = 0;
        int[] saveNumbers;
        saveNumbers= new int[10];
        
        int contIngreso=0;
        boolean c=true;
        int cantNums=1;
       	int sumaNums=0;

        //AQUI PEDIMOS LOS DATOS A PROCESAR
        while(true){
            
            System.out.println("INGRESE UN NÙMERO: ");
	    newNumber = teclado.nextInt();
	    
            if (contIngreso<=1){
	       	saveNumbers[cantNums]=newNumber;
	       	cantNums=cantNums+1;
	    }
	    
            if (contIngreso>1){
	    
                sumaNums=saveNumbers[cantNums-1]+saveNumbers[cantNums-2];

                if (sumaNums==newNumber){
                    
                    System.out.println("");
		    System.out.println(":::NO PUEDE INGRESAR ESTE NÙMERO, POR FAVOR INTENTE NUEVAMENTE");
		    
	        
                } else {
		    
                    saveNumbers[cantNums]=newNumber;
                    cantNums=cantNums+1;
		}
	    }
	    contIngreso=contIngreso+1;
	}
    }
}
