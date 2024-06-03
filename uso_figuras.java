package poo;
import java.io.*;
import java.util.Scanner; 
/**
 *
 * @author cristianM
 */
public class uso_figuras {
    public static void main(String args[]){
    
    float radio=0;
    float altura=0, base=0, area=0, per=0;
    int opcion; 
    String nom ="";
  
   Scanner sc = new Scanner(System.in);
   
   Triangulo tri = new Triangulo();
   Rectangulo rec =new Rectangulo();
   Cuadrado cua =new Cuadrado();
   Circulo cir =new Circulo();
   lectura lee =new lectura();
   
  System.out.println("\n           CALCULADORA GEOMETRICA\n");
   
   opcion=lee.obtenerEntero("Escoga la figura: 1 Triangulo, 2 Cuadrado, 3 Rectangulo, 4 Circulo");
   
   switch(opcion)
   {
       case 1:
           
           altura=lee.obtenerFlotante("Escriba la altura: ");
           base=lee.obtenerFlotante("Escriba la base: ");
           nom=lee.obtenerString("Escriba el nombre para su figura: ");
           tri.establece_nombrefig(nom);
           tri.establece_altura(altura);
           tri.establece_base(base);
           tri.calcula_area(area);
           tri.calcula_perimetro(per);
           System.out.println("El area del triangulo es: "+tri.obtener_area()+"\nEl perimetro del triangulo es: "+tri.obtener_perimetro()
                   + ""+"\nEl nombre de la figura es :"+tri.obtener_nombrefig());
           break; 
           
       case 2:
          
           altura=lee.obtenerFlotante("Escriba la altura: ");
           base=lee.obtenerFlotante("Escriba la base: ");
           rec.establece_altura(altura);
           rec.establece_base(base);
           rec.calcula_area(area);
           rec.calcula_perimetro(per);
           System.out.println("El area del rectangulo es: "+rec.obtener_area()+"\nEl perimetro del rectangulo es: "+rec.obtener_perimetro()
           +"\nEl nombre de su figura es: "+rec.obtener_nombrefig());
           break;
                
       case 3: 
           altura=lee.obtenerFlotante("Escriba el lado: ");
           nom=lee.obtenerString("Escriba el nombre de su figura: ");
           cua.establece_nombrefig(nom);
           cua.establece_lado(altura);
           cua.calcula_area(area);
           cua.calcula_perimetro(per);
           System.out.println("El area del cuadradro es: "+cua.obtener_area()+"\nEl perimetro del cuadrado es: "+cua.obtener_perimetro()+
           "\nEl nombre de su figura es: "+cua.obtener_nombrefig());
           break;
           
       case 4:
           radio=lee.obtenerFlotante("Escriba el radio: ");
           nom=lee.obtenerString("Escriba el nombre de su figura: ");
           cir.establece_nombrefig(nom);
           cir.establece_radio(radio);
           cir.calcula_area(area);
           cir.calcula_perimetro(per);
           System.out.println("El area del circulo es: "+cir.obtener_area()+"\nEl perimetro del circulo es: "+cir.obtener_perimetro()+
           "\nEl nombre de su figura es: "+cir.obtener_nombrefig());
           break;
     
    }
  } 
}