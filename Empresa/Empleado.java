
public class Empleado
{
private String nombre;
public Empleado(){    
}
public Empleado(String nombre){
    this.nombre=nombre;
    System.out.println("Constructor empleado "+nombre);
}
public String getnombre(){
    return nombre;
}
public void setnombre(String nombre){
    this.nombre=nombre;
}
//@Override 
public String ToString(){
    return "Empleado"+nombre;
}

}