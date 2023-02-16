import java.util.Scanner;
public class Principal
{
 public static int indiceBarato(Vehiculo carro[]){
   float precio;
   int indice=0;
   precio=carro[0].getPrecio();
   for(int i=1;i<carro.length;i++){
       if(carro[i].getPrecio()<precio){
           precio=carro[i].getPrecio();
           indice=i;
       }
   }
    }
    public static void main(String args[]){
    
     Scanner in=new Scanner (System.in); 
     String Marca,Modelo;
     float Precio;
     int NV;
     System.out.println("Ingrese La cantidad de Vehiculos");
     NV=in.nextInt();
     
     Vehiculo carro[]=new Vehiculo[NV];
     
     for(int i=0;i<NV;i++){
     System.out.println("Ingrese las caracteristicas del Vehiculo");
     System.out.println("Ingrese la Marca:");
     Marca=in.nextLine();
     System.out.println("Ingrese la Modelo:");
     Modelo=in.nextLine();
     System.out.println("Ingrese el Precio:");
     Precio=in.nextFloat();
     
     carro[i]=new Vehiculo(Marca,Modelo,Precio);
    }
     indiceBarato= indiceBarato(carro);
     System.out.println("\n El coche mas barato es");
     System.out.println(carro[indiceBarato].Mostrar());

     
    }
 }

