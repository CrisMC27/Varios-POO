package poo;
/**
 *
 * @author CristianM 
 */
public class PTC extends datos_personales_1 {
    
    private float  salario, salariobase;
 
public PTC() {
   
}    

public void establecer_salario(float sal)
 
{
salario = sal; 
}  

public void calcula_salariobase(float calcula_salariobase){
       salariobase=salario+100000;
    } 
     
public double obtener_salariobase(){
        return salariobase;
    }

}