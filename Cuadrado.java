
package poo;

/**
 *
 * @author cristianM
 */
public class Cuadrado extends Figura {
    
     private float a, area, perimetro;
    
     public Cuadrado() {
   
}
    public void establece_lado(float lad){
        a = lad;
    } 
    public void calcula_area(float calcula_area){
       area=a*2;
    }
    public void calcula_perimetro(float calcula_perimetro){
       perimetro=a*4;
    }
    public float obtener_area(){
        return area;
    }
    public float obtener_perimetro(){
        return perimetro;
    }
    
}
