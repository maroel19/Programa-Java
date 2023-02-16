
/**
 * Implementar una Calculadora de Números Enteros, mediante un proyecto de 
consola en JAVA
 * 
 * @author (Mujica Toaza Mario Joel) 
 *(Tarea #1 Programacion Orientada a Objetos.)
 */
//CALCULADORA

import java.util.Scanner;

public class Calculadora
{
   public static void main(String[] args) 
    {
            int opcion = 0;
            double resto,val1, val2;
            Scanner entrada = new Scanner(System.in);
            
            do{
            
                do
                {
                    System.out.println("***** MENÚ DE OPCIONES *****");
                    System.out.println("   1. Sumar dos numeros.");
                    System.out.println("   2. Restar dos numeros.");
                    System.out.println("   3. Multiplicar dos numeros.");
                    System.out.println("   4. División de dos numeros.");
                    System.out.println("   5. Dado un número determinar si es número primo.");
                    System.out.println("   6. Salir.");
                    System.out.print(" Ingrese un numero del 1 - 6: ");
                    opcion = entrada.nextInt();
                
                }while(opcion < 1 || opcion > 6);
            
                switch(opcion)
                {
                    case 1:
                        System.out.print(" Ingrese un numero: ");
                        val1 = entrada.nextDouble();
                        System.out.print(" Ingrese un numero: ");
                        val2 = entrada.nextDouble();
                        double suma = val1 + val2;
                        System.out.println("El Resultado es: "+ val1 + " + " + val2 + " = " + (int)suma);
                        break;
                    
                    case 2:
                
                        System.out.print(" Ingrese un numero: ");
                        val1 = entrada.nextDouble();
                        System.out.print(" Ingrese un numero: ");
                        val2 = entrada.nextDouble();
                        double resta = val1 - val2;
                        System.out.println("El Resultado es: "+ val1 + " - " + val2 + " = " + (int)resta);
                        break;
                    
                    case 3:
                    
                        System.out.print(" Ingrese un numero: ");
                        val1 = entrada.nextDouble();
                        System.out.print(" Ingrese un numero: ");
                        val2 = entrada.nextDouble();
                        double multiplicar = val1 * val2;
                        System.out.println("El Resultado es: "+ val1 + " * " + val2 + " = " + (int)multiplicar);
                        break;
                    
                    case 4:

                        System.out.print(" Ingrese un numero: ");
                        val1 = entrada.nextDouble();
                        System.out.print(" Ingrese un numero: ");
                        val2 = entrada.nextDouble();
                if(val2 == 0){
                                System.out.println("ERROR : No se puede dividir un numero para 0");
                                break;
                            }
                        double division = val1 / val2;
                resto = val1 % val2;
                               System.out.println("El Resultado es: "+ val1 + " / " + val2 + " = " + (int)division +" ( Resto = "+resto+" )");
                        break;
                    
                    case 5:
                        
                        int cont,i,val;
        
                        System.out.println("Ingresa un numero: ");
        
                        val = entrada.nextInt();
                        cont = 0;
                        for(i = 1; i <= val; i++){
                            if((val % i) == 0){
                                cont++;
                            } // End if
                        } // End for
        
                        if(cont <= 2){
                            System.out.println("El numero ingresado es primo");
                        }else{
                            System.out.println("El numero ingresado no es primo");
                        } // End if
                        
                        break;
                    case 6:
                        System.exit(0);
                }
                
                
               
            }while(opcion != 6);
    }
}