
package poo;
import java.util.Scanner;  
/**
 *
 * @author crist
 */
public class Fecha {
   
    public Fecha() {

	}
   
     public static void main(String args[]){
        int segundos=0;
	int hora=0;
        int minutos=0;
        lectura lee =new lectura();
        
        hora=lee.obtenerEntero("Escriba la hora: ");
                /**
		 *La hora debe ser un numero entero entre 0 y 12
		 */
		assert (0 <= hora && hora <= 12) : "Hora incorrecta";
		/**
		 * Los minutos debe ser un numero entero entre 0 y 60
		 */
		assert (0 <= minutos && minutos < 59) : "minutos incorrectos";
                
                assert (0 <= segundos && segundos < 60) : "segundos incorrectos";
                
     }
}
