
package poo;

import java.awt.Color;
import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author Sala_03
 */
public class Controlador {
            public static void main(String[] args) {
        int x=0, y=0, opcion=0;
        String titulo="";
        String col="";
        
        Scanner sc = new Scanner(System.in);

       miMarco2 m1=new miMarco2();
       m1.setVisible(true);
       m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       
       lectura lee =new lectura();
      
       
       while(opcion !=6){
           
           opcion= lee.obtenerEntero("Escoja: 1 para cambiar tamaño, 2 para cambiar posicion, 3 para escribir el titulo,\n "+
                   "4 para establecer el tamaño minimo, 5 para cambiar el color del fondo y 6 para salir: ");
           
       switch(opcion){
       
        case 1: 
            x=lee.obtenerEntero("Escriba el ancho: ");
            y=lee.obtenerEntero("Escriba el alto: ");
            m1.cambiarTamano1(x, y);
            break;
            
        case 2:
            x=lee.obtenerEntero("Escriba la posicion x: ");
            y=lee.obtenerEntero("Escriba la posicion y: ");
            m1.cambiarPosicion(x, y);
            break;
            
        case 3:  
            titulo=lee.obtenerString("Escriba un titulo para la ventana: ");
            m1.nombreVentana(titulo);
            break;
            
        case 4:
            x=lee.obtenerEntero("Escriba el ancho minimo: ");
            y=lee.obtenerEntero("Escriba el alto minimo: ");
            m1.estableceDimension(x, y);
            break;
           
        case 5:
            break;
            
        case 6:
           System.out.println("Gracias y vuelva pronto");
           System.exit(0);
           break;
            
       }

    }
   }
}
