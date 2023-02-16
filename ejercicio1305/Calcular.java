import javax.swing.JOptionPane;
/**
 * Write a description of class Calcular here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calcular
{
//Atributos
int n1,n2,suma,resta,multiplicacion,division;
public void leer_numero(){
    n1 =Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
    n2 =Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
}

public void sumar(){
    suma=n1+n2;
}

public void restar(){
    resta=n1-n2;
}

public void multiplicar(){
    multiplicacion =n1*n2;
}

public void division(){
    division =n1/n2;
}

}
