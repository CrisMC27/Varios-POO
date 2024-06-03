
package poo;
import java.io.*;
/**
 *
 * @author cristianM
 */
public class Triangulo extends Figura {
    private float base, altura, perimetro, area, hipotenusa;
    
    public Triangulo() {
   
}
    public void establece_base(float bas){
        base = bas;
    } 
    public void establece_altura(float alt){
        altura = alt;
    }
    public void calcula_area(float calcula_area){
       area=altura*base/2;
    }
    public void calcula_hipotenusa(float calcula_hipotenusa){
       hipotenusa=(float) Math.sqrt((altura*altura)+(base*base));
    }
    public void calcula_perimetro(float calcula_perimetro){
       perimetro=altura+base+hipotenusa;
    }
    public float obtener_area(){
        return area;
    }
    public float obtener_perimetro(){
        return perimetro;
    }
}
