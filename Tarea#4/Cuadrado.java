
/**
 * Write a description of class Cuadrado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cuadrado extends Figura
{
    private double lado1;
    
    public Cuadrado(double lado1){
        super(1);
        this.lado1=lado1;
        
    }
    public double getLado1(){
        return lado1;
    }
    @Override
    public String ToString(){
    return "\nCuadradi: "+super.ToString()+"\nLados: "+lado1;

    }
    @Override
    public double area(){
        return lado1*lado1;
    }
}