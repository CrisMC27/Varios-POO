package poo;

/**
 *
 * @author CristianM
 */
public class PMTD extends datos_personales_1 {
    
    private float  salario, salariobase;

    
public PMTD() {
   
}    

public void establece_salario(float sal){
        salario = sal;
    } 
public void calcula_salariobase(float calcula_salariobase){
       salariobase=salario;
    } 
public double obtener_salariobase(){
        return salario;
    }      
}