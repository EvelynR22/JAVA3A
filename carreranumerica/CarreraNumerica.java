/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreranumerica;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author evely
 */
public class CarreraNumerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op=0, cantj=0, nivel=0, dado1=0, dado2=0, suma=0, acum1=0, acum2=0, acum3=0, acum4=0;
        boolean b=false, a=false;
        
        Scanner teclado=new Scanner(System.in);
                
        while (op!=2){
            
            System.out.println("Bienvenido");
            System.out.println("Digite una opcion: "
                +"\n1.COMENZAR EL JUEGO  "
                +"\n2.SALIR  "
                + "\n");
            op=teclado.nextInt();
            
            switch (op){
                case 1:                   
                System.out.print("DIGITE NUMERO DE JUGADORES, MÀXIMO 4, MÌNIMO 2::: ");
                cantj=teclado.nextInt();
                      
                if (cantj<2 || cantj>4){
                    b=false;
                    System.out.println("respuesta incorrecta ");
                }else{
                    b=true;
                    
                    System.out.print("SELECCIONE NIVEL DE TABLERO "   
                        + "\n 1.Nivel básico (Tablero de 20 posiciones) "
                        + "\n 2.Nivel intermedio (Tablero de 30 posiciones) "
                        + "\n 3.Nivel avanzado (Tablero de 50 posiciones) "
                        + "\n");
                    nivel=teclado.nextInt();
                    //una vez guardada la respuesta 
                    do{
                        //JUGADOR UNO
                        do{
                            switch (nivel) {
                                case 1:
                                    {
                                        a=false;
                                        System.out.print("JUGADOR NUMERO UNO, BIENVENIDO AL JUEGO:::"
                                                +"\n"); //REALIZAR NUMEROS ALEATOREAMENTE RANDOM :)                 
                                        System.out.print("PRESIONE TECLA 1, PARA LANZAR LOS DADOS::: ");
                                        teclado.nextInt();
                                        Random r = new Random();
                                        dado1 = (int) (r.nextDouble() * 6+1);
                                        System.out.println("DADO 1 : "+dado1);
                                        dado2 = (int) (r.nextDouble() * 6+1);
                                        System.out.println("DADO 2 : "+dado2
                                                +"\n"); suma=dado1+dado2;
                                                System.out.println("TOTAL LANZAMIENTO: "+suma);
                                                acum1=acum1+suma;
                                                System.out.println("ACUMULADO: "+acum1
                                                        +"\n"); if (acum1>19){
                                                            System.out.println(":::GANA EL JUEGO:::"
                                                                    +"\n");
                                                            System.out.println("EL JUEGO HA TERMMINADO");
                                                            teclado.nextInt();
                                                            
                                                        }else if (acum1>29){
                                                            System.out.println(":::GANA EL JUEGO:::"
                                                                    +"\n");
                                                            System.out.println("EL JUEGO HA TERMMINADO");
                                                            teclado.nextInt();
                                                        }else if (acum1>49){
                                                            
                                                            System.out.println(":::GANA EL JUEGO:::"
                                                                    +"\n");
                                                            System.out.println("EL JUEGO HA TERMMINADO");
                                                            teclado.nextInt();
                                                        }       break;
                                    }
                                case 2:
                                    {
                                        a=false;
                                        System.out.print("JUGADOR NUMERO UNO, BIENVENIDO AL JUEGO:::"
                                                +"\n"); //REALIZAR NUMEROS ALEATOREAMENTE RANDOM :)                 
                                        System.out.print("PRESIONE TECLA 1, PARA LANZAR LOS DADOS::: ");
                                        teclado.nextInt();
                                        Random r = new Random();
                                        dado1 = (int) (r.nextDouble() * 6+1);
                                        System.out.println("DADO 1 : "+dado1);
                                        dado2 = (int) (r.nextDouble() * 6+1);
                                        System.out.println("DADO 2 : "+dado2
                                                +"\n"); suma=dado1+dado2;
                                                System.out.println("TOTAL LANZAMIENTO: "+suma);
                                                acum1=acum1+suma;
                                                System.out.println("ACUMULADO: "+acum1
                                                        +"\n"); if (acum1>19){
                                                            System.out.println(":::GANA EL JUEGO:::"
                                                                    +"\n");
                                                            System.out.println("EL JUEGO HA TERMMINADO");
                                                            teclado.nextInt();
                                                        }else if (acum1>29){
                                                            System.out.println(":::GANA EL JUEGO:::"
                                                                    +"\n");
                                                            System.out.println("EL JUEGO HA TERMMINADO");
                                                            teclado.nextInt();
                                                        }else if (acum1>49){
                                                            System.out.println(":::GANA EL JUEGO:::"
                                                                    +"\n");
                                                            System.out.println("EL JUEGO HA TERMMINADO");
                                                            teclado.nextInt();
                                                        }       break;
                                    }
                                case 3:
                                    {
                                        a=false;
                                        System.out.print("JUGADOR NUMERO UNO, BIENVENIDO AL JUEGO:::"
                                                +"\n"); //REALIZAR NUMEROS ALEATOREAMENTE RANDOM :)                 
                                        System.out.print("PRESIONE TECLA 1, PARA LANZAR LOS DADOS::: ");
                                        teclado.nextInt();
                                        Random r = new Random();
                                        dado1 = (int) (r.nextDouble() * 6+1);
                                        System.out.println("DADO 1 : "+dado1);
                                        dado2 = (int) (r.nextDouble() * 6+1);
                                        System.out.println("DADO 2 : "+dado2
                                                +"\n"); suma=dado1+dado2;
                                                System.out.println("TOTAL LANZAMIENTO: "+suma);
                                                acum1=acum1+suma;
                                                System.out.println("ACUMULADO: "+acum1
                                                        +"\n"); break;
                                    }
                                default:
                                    break;
                            }
                            if (acum1>19){
                                System.out.println(":::GANA EL JUEGO:::"
                                    +"\n");
                                    System.out.println("EL JUEGO HA TERMMINADO");
                                teclado.nextInt();
                            }else if (acum1>29){
                                System.out.println(":::GANA EL JUEGO:::"
                                    +"\n");
                                    System.out.println("EL JUEGO HA TERMMINADO");
                                teclado.nextInt();
                            }else if (acum1>49){
                                System.out.println(":::GANA EL JUEGO:::"
                                    +"\n");
                                    System.out.println("EL JUEGO HA TERMMINADO");
                                teclado.nextInt();
                            }
                        }while(dado1==dado2);
                        //JUGADOR DOS
                        if (nivel==1){
                            a=false;
                            System.out.print("JUGADOR NUMERO DOS, BIENVENIDO AL JUEGO:::"
                            +"\n");
                            //REALIZAR NUMEROS ALEATOREAMENTE RANDOM :)                 
                            System.out.print("PRESIONE TECLA 1, PARA LANZAR LOS DADOS::: ");
                            teclado.nextInt();

                            Random r = new Random();
                            dado1 = (int) (r.nextDouble() * 6+1);
                            System.out.println("DADO 1 : "+dado1);

                            dado2 = (int) (r.nextDouble() * 6+1);
                            System.out.println("DADO 2 : "+dado2
                            +"\n");

                            suma=dado1+dado2;
                            System.out.println("TOTAL LANZAMIENTO: "+suma);

                            acum2=acum2+suma;
                            System.out.println("ACUMULADO: "+acum2
                            +"\n");

                            if (acum2>=20){

                                System.out.println(":::GANA EL JUEGO:::"
                                    +"\n");
                                    System.out.println("EL JUEGO HA TERMMINADO");
                                teclado.nextInt();
                            }
                        }
                        //JUGADOR TRES
                        do{
                            if (nivel==1){
                                a=false;
                                System.out.print("JUGADOR NUMERO TRES; BIENVENIDO AL JUEGO:::"
                                +"\n");
                                //REALIZAR NUMEROS ALEATOREAMENTE RANDOM :)                 
                                System.out.print("PRESIONE TECLA 1, PARA LANZAR LOS DADOS::: ");
                                teclado.nextInt();

                                Random r = new Random();
                                dado1 = (int) (r.nextDouble() * 6+1);
                                System.out.println("DADO 1 : "+dado1);

                                dado2 = (int) (r.nextDouble() * 6+1);
                                System.out.println("DADO 2 : "+dado2
                                +"\n");

                                suma=dado1+dado2;
                                System.out.println("TOTAL LANZAMIENTO: "+suma);

                                acum3=acum3+suma;
                                System.out.println("ACUMULADO: "+acum3
                                +"\n");

                                if (acum3>=20){
                                    System.out.println(":::GANA EL JUEGO:::"
                                        +"\n");
                                        System.out.println("EL JUEGO HA TERMMINADO");
                                    teclado.nextInt();
                                }
                            }
                        }while(dado1==dado2);
                        //JUGADOR CUATRO
                        do{
                            if (nivel==2){
                                a=false;
                                System.out.print("JUGADOR NUMERO TRES; BIENVENIDO AL JUEGO:::"
                                +"\n");
                                //REALIZAR NUMEROS ALEATOREAMENTE RANDOM :)                 
                                System.out.print("PRESIONE TECLA 1, PARA LANZAR LOS DADOS::: ");
                                teclado.nextInt();

                                Random r = new Random();
                                dado1 = (int) (r.nextDouble() * 6+1);
                                System.out.println("DADO 1 : "+dado1);

                                dado2 = (int) (r.nextDouble() * 6+1);
                                System.out.println("DADO 2 : "+dado2
                                +"\n");

                                suma=dado1+dado2;
                                System.out.println("TOTAL LANZAMIENTO: "+suma);

                                acum4=acum4+suma;
                                System.out.println("ACUMULADO: "+acum4
                                +"\n");
                                if (acum4>=20){
                                    System.out.println(":::GANA EL JUEGO:::"
                                        +"\n");
                                        System.out.println("EL JUEGO HA TERMMINADO");
                                    teclado.nextInt();
                                }
                            }
                        }while(dado1==dado2);
                    }while (acum1<19 || acum2<19 || acum3<19 || acum4<19);
                }                   
                break;
            case 2:
                System.out.println("HA SALIDO DEL SISTEMA");
                break;
            default:
                System.out.println("USTED DIGITÒ UNA RESPUESTA INCORRECTA");
                break; 
            }
        }
    }
}
