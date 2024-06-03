
package poo;

/**
 *
 * @author cristianM
 */
public class Rectangulo extends Figura{
    private float a, b, area, perimetro;
    
     public Rectangulo() {
   
}
     public void establece_base(float bas){
        b = bas;
    }
     public void establece_altura(float alt){
        a = alt;
    }
     public void calcula_area(float calcula_area){
       area=a*b;
    }
     public void calcula_perimetro(float calcula_perimetro){
       perimetro=2*(a*b);
    }
     public float obtener_area(){
        return area;
    }
     public float obtener_perimetro(){
        return perimetro;
    }
}
