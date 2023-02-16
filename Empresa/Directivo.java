
/**
 * Write a description of class Directivo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Directivo extends Empleado
{
     public Directivo(String nombre){
        super(nombre);
        System.out.println("Constructor de Directivo");
    }
    
    public Directivo(){}
        @Override
        public String ToString(){
            return super.ToString()+"Directivo";
        }
}
}
