package poo;

/**
 *
 * @author CristianM
 */
public class HC extends datos_personales_1 {

    private float  horas, salariobase, valorhora;

    
public HC() {
   
}    

public void establece_horas(float hr){
        horas=hr;
    } 
public void establece_valorhr(float valh){
        valorhora=valh;
    }   
public void calcula_salariobase(float calcula_salariobase){
        salariobase=horas*valorhora;
    }
public float obtener_salariobase(){
        return salariobase;
    }
}