package poo;

public class OperacionesAritmeticas {
    
    private double a;
    private double b;
    private double c; 
    
    public OperacionesAritmeticas(){
    
    }
    
    //setters
    
    public void establecerA(double valorA){
        
        a = valorA;
    }
    
    public void establecerB(double valorB)
     {
        b = valorB;    
     }
    
    public void calcularSuma(double a, double b )
     {
        c = a + b;    
     }
    
    public void calcularResta(double a, double b)
     {
        c = a - b;    
     }
    
    public void calcularMultiplicacion(double a, double b)
     {
        c = a * b;    
     }
    
    public void calcularDivision(double a, double b)
     {
        c = a / b;    
     }
    
    public void calcularPotencia(double a, double b)
     {
        c = Math.pow(a,b);    
     }
    
   //getters 
    
    public double obtenerSuma()
     {
        return c;
     }
    
    public double obtenerResta()
     {
        return c;
     }
    
    public double obtenerMultiplicacion()
     {
        return c;
     }

    public double obtenerDivision()
     {
        return c;
     }
    
    public double obtenerPotencia()
     {
        return c;
     }
}
