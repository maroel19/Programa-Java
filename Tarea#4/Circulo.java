
/**
 * Write a description of class Circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circulo extends Figura
{
    private double radio;
    public Circulo(double radio){
        super(1);
        this.radio=radio;
    }
    
    public double getradio(){
        return radio;
    }
    @Override
    public String ToString(){
    return "\nCirculo: "+super.ToString()+"\nRadio: "+radio;

    }
    @Override
    public double area(){
        return (radio*radio)*3.14f;
    }
}
