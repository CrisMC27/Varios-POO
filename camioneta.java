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
public class camioneta extends vehiculo{
    
    private int capacidad_carga;
    private int asientos_totales;
    
    public camioneta(int asientos_totales, int capacidad_carga){
        super();//llama al constructor de la clase padre
        this.capacidad_carga=capacidad_carga;
        this.asientos_totales=asientos_totales;
    }
    public String obtener_datos_camioneta() {
        return "La capacidad de carga es: "+capacidad_carga+" y los asientos totales son: "+ asientos_totales;
    } 
}
