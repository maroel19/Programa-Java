
/**
 * Write a description of class Profe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Profe
{
   String Nombre;
   String Apellido;
   int Ed;
   boolean Cas;
   boolean Esp;
   public Profe (String Nombre,String Apellido,int Ed){
       this.Nombre=Nombre;
       this.Apellido=Apellido;
       this.Ed=Ed;

   }
   
   public Profe (boolean Cas,boolean Esp){
       this.Cas=Cas;
       this.Esp=Esp;
   }
   
   public void Consulta(){
       System.out.println("Soy "+Nombre+" "+Apellido+ " tengo "+Ed+" años");
       
   }
   
   public void Consulta(boolean Cas,boolean Esp){
       System.out.println("Casado" +Cas+ " y Soy Especialesta "+Esp+" ");
       
}
}