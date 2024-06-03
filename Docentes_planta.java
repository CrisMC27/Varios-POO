/**
 *
 * @author cristian y camila
 */
package poo;

public class Docentes_planta extends Empleados{
    
    private String jornada;
    private String materia;
    
    
public Docentes_planta() {
}    
    
public String obtener_jornada(){
        return jornada;
    }
public String obtener_materia(){
        return materia;
    }
    
public void establece_jornada(String obtener_jornada){
        obtener_jornada=jornada;
    }    
public void establece_materia(String obtener_materia){
        obtener_materia=materia;
    }    
        
}


