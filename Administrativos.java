/**
 *
 * @author cristian y camila
 */
package poo;

public class Administrativos extends Empleados {
    
  private String facultad;
    private String correo;
    
    
public Administrativos() {
}    
    
public String obtener_facultad(){
        return facultad;
    }
public String obtener_correo(){
        return correo;
    }
    
public void establece_facultad(String obtener_facultad){
        obtener_facultad=facultad;
    }    
public void establece_correo(String obtener_correo){
        obtener_correo=correo;
    }     
     
}
