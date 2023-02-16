
/**
 * Write a description of class Oficial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Oficial extends Operario
{
      public Oficial(String nombre){
        super(nombre);
        System.out.println("Constructor de Oficial");
    }
    
    public Oficial(){}
        @Override
        public String ToString(){
            return super.ToString()+"Oficial";
        }
}

