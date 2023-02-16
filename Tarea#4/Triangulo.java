
/**
 * Write a description of class Triangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangulo extends Figura
{
        private double base;
        private double altura;
    public Triangulo(double altura,double base){
        super(2);
        this.base=base;
        this.altura=altura;
    }
    
    public double getbase(){
        return base;
    }
    public double getaltura(){
        return altura;
    }
    @Override
    public String ToString(){
    return "\nCirculo: "+super.ToString()+"\nBase: "+base+"\nAltura: "+altura;

    }
    @Override
    public double area(){
            return base*altura/2;
    }
}
