import java.util.Scanner;
/**
 * Write a description of class Vehiculo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vehiculo
{
    String Marca,Modelo;
    float Precio;
    //Metodo constructor
     public Vehiculo(String Marca,String Modelo,float Precio){
         this.Marca=Marca;
         this.Modelo=Modelo;
         this.Precio=Precio;
         
     }
     public float getPrecio(){
         return Precio;
     }
     public String Mostrar(){
         return "Marca:" +Marca+ "Modelo" +Modelo+ "Precio" +Precio+ "";
     }

    }
    
