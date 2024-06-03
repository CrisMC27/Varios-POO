package poo;

/**
 *
 * @author CristianM
 */
public class PMTN extends datos_personales_1{
    
    private float  salario, salariobase;

    
public PMTN() {
   
}    
    
public void establece_salario(float sal){
        salario=sal;
    } 
public void calcula_salariobase(float calcula_salariobase){
       salariobase=salario+80000;
    }  
public double obtener_salariobase(){
        return salariobase;
    }
}