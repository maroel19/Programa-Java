public class Estudiante extends Persona{
    private int CodEst;
    private float NF;
    
    public Estudiante(String Nombre, String Apellido,int Edad,int CodEst,float NF){
     super (Nombre,Apellido,Edad);
     this.CodEst=CodEst;
     this.NF=NF;
    }
    
    public void MostrarDatos(){
        System.out.println("Nombre: "+getNombre()+"\nApellido: "+getApellido()+"\nEdad: "+getEdad()+"\nCodigo_Estudiante: "+getCodEst()+"\nNotafinal: "+getNF()+);
    }
}
