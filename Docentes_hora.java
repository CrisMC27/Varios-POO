/**
 *
 * @author cristian y camila
 */
package poo;

public class Docentes_hora extends Empleados {
    
    private float horas_diarias;
    private float salario;
    
    
public Docentes_hora() {
}    
    
public float obtener_horas_diarias(){
        return horas_diarias;
    }
public float obtener_salario(){
        return salario;
    }
    
public void establece_horas_diarias(float obtener_horas_diarias){
        obtener_horas_diarias=horas_diarias;
    }    
public void establece_salario(float obtener_salario){
        obtener_salario=salario;
    } 
       
}
