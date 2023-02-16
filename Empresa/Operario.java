public class Operario extends Empleado{
    public Operario(String nombre){
        super(nombre);
        System.out.println("Constructor de Operario");
    }
    
    public Operario(){}
        @Override
        public String ToString(){
            return super.ToString()+"Operario";
        }
}
}