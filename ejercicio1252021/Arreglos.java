import java.util.Scanner;
public class Arreglos
{
    public static void main(String[] args){
        //CREACION DE UN ARREGLO
        int[] numero = new int[7];
        
        //ASIGNAMOS UN VALOR A CADA INDICE DEL ARREGLO
        numero[0] = 7;
        numero[1] = 12;
        numero[2] = 4;
        numero[3] = 5;
        numero[4] = 2;
        numero[5] = 15;
        numero[6] = 8;
        
        System.out.println("\nVALORES DEL ARREGLO: \n");
        for(int indice = 0; indice < 7; indice ++){
            System.out.println("El indice " + indice + " contiene el numero: "+ numero[indice]);
            
        }
    }
}
