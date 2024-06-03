/**
 *
 * @author cristian y camila
 */
package poo;

public class Estudiantes extends Datos_personales{
    
   private String carrera;
   private String modalidad;
       
public Estudiantes() {
}    
    
public String obtener_carrera(){
        return carrera;
    }
public String obtener_modalidad(){
        return modalidad;
    }
    
public void establece_carrera(String obtener_carrera){
        obtener_carrera=carrera;
    }    
public void establece_modalidad(String obtener_modalidad){
        obtener_modalidad=modalidad;
    } 
      
}
