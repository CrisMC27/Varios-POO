
package poo;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author cristianM
 */

public class FigurasGeometricas {
    
    public static void main(String args[]){
    
    Scanner sc = new Scanner(System.in);
    float valor=0, areaCua=0, perCua=0;
    float areaCir=0, perCir=0;
    float catea=0, cateb=0, areaTri=0, perTri=0;
    float ladoa=0, ladob=0, areaRec=0, perRec=0;
    int opcion;
    
    Figuras Figurasgeo = new Figuras();
    
    System.out.println("\n           CALCULADORA GEOMETRICA\n");
    
    System.out.print("Escoga su operacion: 1 para Area de Cuadrado, 2 para Area de Rectangulo, 3 para Area Triangulo Rectangulo, "
            + "4 para Area Circulo,\n 5 para Perimetro Rectangulo, 6 para Perimetro Cuadrado, 7 para Perimetro Triangulo Rectangulo, "
            + "8 para Perimetro Circulo, 9 para Salir ");
    System.out.println();
    opcion = sc.nextInt();
    System.out.println("Escogio: "+opcion);
    
    switch(opcion){
    
        case 1:
            System.out.print("Ingrese el valor de A: ");
            valor=sc.nextFloat();
            areaCua=Figurasgeo.obtenerAreaCuadrado(valor);
            System.out.println("El area del cuadrado es: "+areaCua);
            break;
            
        case 2:
            System.out.print("Ingrese el valor de A: ");
            ladoa=sc.nextFloat();
            System.out.print("Ingrese el valor de B: ");
            ladob=sc.nextFloat();
            areaRec=Figurasgeo.obtenerAreaRectangulo(ladoa,ladob);
            System.out.println("El area del rectangulo es: "+areaRec);
            break;    
            
        case 3:
            System.out.print("Ingrese el valor de A: ");
            catea=sc.nextFloat();
            System.out.print("Ingrese el valor de B: ");
            cateb=sc.nextFloat();
            areaTri=Figurasgeo.obtenerAreaTriangulo(catea,cateb);
            System.out.println("El area del triangulo rectangulo es: "+areaTri);
            break;    
            
        case 4:
            System.out.print("Ingrese el valor del radio: ");
            valor=sc.nextFloat();
            areaCir=(float) Figurasgeo.obtenerAreaCirculo(valor);
            System.out.println("El area del circulo es: "+areaCir);
            break;    
            
        case 5:
            System.out.print("Ingrese el valor de A: ");
            ladoa=sc.nextFloat();
            System.out.print("Ingrese el valor de B: ");
            ladob=sc.nextFloat();
            perRec=Figurasgeo.obtenerPerimetroRectangulo(ladoa,ladob);
            System.out.println("El perimetro del rectangulo es: "+perRec);
            break;    
            
        case 6:
            System.out.print("Ingrese el valor de A: ");
            valor=sc.nextFloat();
            perCua=Figurasgeo.obtenerPerimetroCuadrado(valor);
            System.out.println("El perimetro del cuadrado es: "+perCua);
            break;    
            
        case 7:
            System.out.print("Ingrese el valor de A: ");
            ladoa=sc.nextFloat();
            System.out.print("Ingrese el valor de B: ");
            ladob=sc.nextFloat();
            perTri=(float) Figurasgeo.obtenerPerimetroTriangulo(ladoa,ladob);
            System.out.println("El perimetro del triangulo es: "+perTri);
            break;    
            
        case 8:
            System.out.print("Ingrese el valor del radio: ");
            valor=sc.nextFloat();
            perCir=(float) Figurasgeo.obtenerPerimetroCirculo(valor);
            System.out.println("El perimetro del circulo es: "+perCir);
            break;
            
        case 9:
            System.exit(0);
            break;    
                
    }
    
   }
}

class Figuras{

    public Figuras(){
    }
    
    
    public float obtenerAreaCuadrado(float a){
        return a*2;
    }
    
    public float obtenerAreaRectangulo(float a, float b){
        return a*b;
    }
    
    public float obtenerAreaTriangulo(float a, float b){
        return a*b/2;
    }
    
    public double obtenerAreaCirculo(double a){
        return Math.PI*a*a;
    }
    public float obtenerPerimetroRectangulo(float a, float b){
        return 2*(a*b);
    }
    public float obtenerPerimetroCuadrado(float a){
        return a*4;
    }
    public double obtenerPerimetroTriangulo(float a, double b){
        return Math.sqrt((a*a)+(b*b));
    }
    public double obtenerPerimetroCirculo(double a){
        return  2*Math.PI*a*a;
    }
    
}
