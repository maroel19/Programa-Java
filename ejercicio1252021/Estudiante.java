import java.util.Scanner;
public class Estudiante
{
    String Nombre, Cedula, Curso;
    int Edad;
    Estudiante(){
        this.Nombre="Mario Mujica";
        this.Cedula="0955093778";
        this.Curso="Dsd08";
        this.Edad=20;
    }
    Estudiante(String Nombre,String Cedula,String Curso,int Edad){
        this.Nombre=Nombre;
        this.Cedula=Cedula;
        this.Curso=Curso;
        this.Edad =Edad;
    }
    //Metodos simples
    public static void estudiar(){
        System.out.println("Estudiante bienvenido a la Institución");
        
    }
    //otro metodo
    public static void notas(){
        int n1,n2,n3,n4,ex,res,tot=0;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Digite nota1:");
        n1=entrada.nextInt();
        System.out.println("Digite nota 2:");
        n2=entrada.nextInt();
        System.out.println("Digite nota 3:");
        n3=entrada.nextInt();
        System.out.println("Digite nota4:");
        n4=entrada.nextInt();
        System.out.println("Digite examen:");
        ex=entrada.nextInt();
        tot=n1+n2+n3+n4+ex;
        System.out.println("el resultado es:"+tot);

}
}
