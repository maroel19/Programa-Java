
/**
 * Write a description of class Jerarquia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jerarquia
{
    public static void main(String[] args){
            Figura f[]=new Figura[3];
            f[0]=new Circulo(10);
            f[1]=new Cuadrado(10);
            f[2]=new Triangulo(10,5);
            for(int i=0;i<3;i++){
                System.out.println(f[i].ToString()+"\nArea: "+f[i].area());
            }
    }
   
}
