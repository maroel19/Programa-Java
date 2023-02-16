/**
 * Abstract class Figura - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Figura
{
 protected int nDatos;
 
 public Figura(int nDatos){
     this.nDatos=nDatos;
 }
 
 public int getnDatos(){
     return nDatos;
 }
 
 public String ToString(){
     return"\nNumero de Datos: "+nDatos;
}

public abstract double area();
}
