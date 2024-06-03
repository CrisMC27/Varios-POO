package poo;
import java.util.Scanner;  
import java.io.*;
public class EjecutaOperaciones {
    
    public static void main(String args[]){
    
    Scanner sc = new Scanner(System.in);
    
    double Vala=0, Valb=0;
    int opcion =0;
    
    OperacionesAritmeticas calculadora = new OperacionesAritmeticas();
    
    System.out.println("\n           CALCULADORA ARITMETICA\n");
    
    System.out.print("Ingrese el valor de A: ");
    Vala = sc.nextDouble();
    System.out.print("Ingrese el valor de B: ");
    Valb = sc.nextDouble();
    
    calculadora.establecerA(Vala);
    calculadora.establecerB(Valb);
    
    if(Valb>0){
        
    }
    
    System.out.print("Escoga su operacion: 1 para suma, 2 para resta, 3 para multiplicacion, "
            + "4 para division, 5 para potenciacion, 6 para salir ");
    System.out.println();
    opcion = sc.nextInt();
    System.out.println("Escogio: "+opcion);
    
    switch(opcion) {
    
        case 1:
            calculadora.calcularSuma(Vala, Valb);
            System.out.println("Suma =" + calculadora.obtenerSuma());
            break;
        case 2:
            calculadora.calcularResta(Vala,Valb);
            System.out.println("Resta =" + calculadora.obtenerResta());
            break;
        case 3:
            calculadora.calcularMultiplicacion(Vala,Valb);
            System.out.println("Multiplicacion =" + calculadora.obtenerMultiplicacion());
            break;
        case 4:
            calculadora.calcularDivision(Vala,Valb);
            System.out.println("Division =" + calculadora.obtenerDivision());
            break;
        case 5:
            calculadora.calcularPotencia(Vala,Valb);
            System.out.println("Potencia =" + calculadora.obtenerPotencia());
            break;
        case 6:
            System.exit(0);
    }
    
    }
}
