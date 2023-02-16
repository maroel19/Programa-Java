
/**
 * Write a description of class Tecnico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tecnico extends Operario
{
      public Tecnico(String nombre){
        super(nombre);
        System.out.println("Constructor de Tecnico");
    }
    
    public Tecnico(){}
        @Override
        public String ToString(){
            return super.ToString()+"Tecnico";
        }
}
}
