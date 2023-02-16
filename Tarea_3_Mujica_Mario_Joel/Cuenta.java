
/**
 * Write a description of class Cuenta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
//Clase Cuenta
public class Cuenta{

    private String nombre;
    private String Nbanco; 
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;
    private String Ciudad;
    private int Cant;
    //Constructor con parámetros
    public Cuenta(String nombre,String Nbanco,String numeroCuenta,String Ciudad,double tipoInteres, double saldo,int Cant){                         
        this.nombre = nombre;
        this.Ciudad=Ciudad;
        this.Nbanco=Nbanco;
        this.numeroCuenta = numeroCuenta;
        this.Cant=Cant;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    //Constructor copia
    public Cuenta(final Cuenta c) {
        nombre = c.nombre;
        Ciudad=c.Ciudad;
        Nbanco=c.Nbanco;
        numeroCuenta = c.numeroCuenta;
        tipoInteres = c.tipoInteres;
        saldo = c.saldo;
    }

    //getters y setters
    public void setNombre(String s) {
        nombre = s;
    }

    public void setCiudad(String s){
        Ciudad = s;
    }
    
    public void setNbanco(String s){
        Nbanco=s;
    }
    public void setNumeroCuenta(String s) {
        numeroCuenta = s;
    }
    
    public void setCant(int t){
        Cant=t;
    }

    public void setTipoInteres(double n) {
        tipoInteres = n;
    }

    public void setSaldo(double n) {
        saldo = n;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getCiudad(){
        return Ciudad;
    }
    
    public String getNbanco(){
        return Nbanco;
    }
    
    public int getCant(){
        return Cant;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    //método ingreso
    public boolean ingreso(double n) {
        boolean ingresoCorrecto = true;
        if (n < 0) {
            ingresoCorrecto = false;
        } else {
            saldo = saldo + n;
        }
        return ingresoCorrecto;
    }

    //método reintegro
    public boolean reintegro(double n) {
        boolean reintegroCorrecto = true;                                                                         
        if (n < 0) {
            reintegroCorrecto = false;
        } else if (saldo >= n) {
            saldo -= n;
        } else {
            reintegroCorrecto = false;
        }
        return reintegroCorrecto;
    }
}
