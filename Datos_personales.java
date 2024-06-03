/**
 *
 * @author cristian y camila
 */
package poo;

public class Datos_personales {
    
   private String nombre_completo;
   private int edad;
   private int cedula;
       
public Datos_personales() {
}    
    
public String obtener_nombre_completo(){
        return nombre_completo;
    }
public int obtener_edad(){
        return edad;
    }

public int obtener_cedula(){
        return cedula;
    }
    
public void establece_nombre_completo(String obtener_nombre_completo){
        obtener_nombre_completo=nombre_completo;
    }    
public void establece_cedula(int obtener_cedula){
        obtener_cedula=cedula;
    }
 
public void establece_edad(int obtener_edad){
        obtener_edad=edad;
    }

}
