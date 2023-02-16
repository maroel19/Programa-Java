public class Multimetro
{
    //atributos//
    String Marca,Color,Tipo;
    //Metodos//
    //metodo constructor por defecto//
    Multimetro(){
        this.Marca = "Sx30";
        
        this.Color = "Rojo";
        
        this.Tipo = "Small"; 
    }
    //Metodo constructor//
    Multimetro(String Marca,String Color,String Tipo){
        this.Marca= Marca;
        this.Color = Color;
        this.Tipo = Tipo;
}
}