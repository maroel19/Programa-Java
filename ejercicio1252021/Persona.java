
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
String Nombre;
int edad;
String codigo;
public Persona(String Nombre,int edad){
this.Nombre=Nombre;
this.edad=edad;
}
public Persona(String codigo){
    this.codigo=codigo;
}
public void correr(){
    System.out.println("Soy"+Nombre+" tengo"+edad+" años y  estoy corriendo la maraton 5K");
    
    
}
public void correr(int km){
    System.out.println("he corrido"+km+" Kilometros");
    
}
}
