/**
 *
 * @author cristian y camila
 */
package poo;

public class Empleados extends Datos_personales{
    
   private String tipo_contrato;
   private String cargo;
       
public Empleados() {
}    
    
public String obtener_tipo_contrato(){
        return tipo_contrato;
    }
public String obtener_cargo(){
        return cargo;
    }
    
public void establece_tipo_contrato(String obtener_tipo_contrato){
        obtener_tipo_contrato=tipo_contrato;
    }    
public void establece_cargo(String obtener_cargo){
        obtener_cargo=cargo;
    } 
    
}
