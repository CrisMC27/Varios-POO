/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author juanc
 */
public class automovil extends vehiculo{
    
    private int cantidad_puertas;
    private int asientos_totales;
    private boolean tipo_caja=false;//false mecanica true automatica
    
    public automovil(int asientos_totales, int cantidad_puertas, String tipoCaja){
        super();//llama al constructor de la clase padre
        this.cantidad_puertas=cantidad_puertas;
        this.asientos_totales=asientos_totales;
        if(tipoCaja=="mecanica" ){
            this.tipo_caja=false;
        }
        else{
            this.tipo_caja=true;
        }
    }
    public String obtener_datos_automovil() {
        String caja;
        if(tipo_caja==false ){
            caja="mecanica";
        }
        else{
            caja="automatica";
        }
        
        return "La cantidad de puertas es: "+cantidad_puertas+" los asientos totales son: "+ asientos_totales+" tipo de caja: "+ caja ;
    } 

}
