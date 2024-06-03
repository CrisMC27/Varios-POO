
package poo;
import java.io.*;
/**
 *
 * @author cristianM
 */
public class Circulo extends Figura{
    
    private float a, area, perimetro;
    
    public Circulo() {
   
}
    public void establece_radio(float rad){
        a = rad;
    }
    public void calcula_area(float calcula_area){
       area=(float) (Math.PI*a*a);
    }
    public void calcula_perimetro(float calcula_perimetro){
       perimetro=(float) (2*Math.PI*a*a);
    }
    public float obtener_area(){
        return area;
    }
    public float obtener_perimetro(){
        return perimetro;
    }
}
