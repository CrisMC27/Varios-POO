
package poo;

public class vehiculo {
    private int ruedas;
    private int largo_plataforma;
    private int ancho;
    private int motor;
    private int peso;
    private String color;
    private int peso_total;
    private boolean asientos_cuero=false, aire_acondicionado=false;
    
    
    public vehiculo(){
        ruedas=4;
        largo_plataforma=2000;
        ancho= 300;
        motor=1600;
        peso=500;
                
    }
    // metodos getters y setters
    // metodos getters
    public int obtener_largo(){
        return largo_plataforma;
    }
    
     public String obtener_largo1(){
        return "el largo del vehiculo es:" +largo_plataforma;
    }    
    public String obtener_color(){
        return "el color del vehiculo es:" +color;
    } 
    
    public String obtener_asientos_cuero(){
        if(asientos_cuero==true){
            return "asientos de cuero: si";
        }
        else{
            return "asientos de cuero: no";
        }
        
    } 
    // metodos setter
    public void establece_color(String color_vehiculo){
        color=color_vehiculo;
    }
    
    public void establece_asientos_cuero(String asientos_cuero){
        if(asientos_cuero=="si" || asientos_cuero=="SI"){
            this.asientos_cuero=true;
        }
        else{
            this.asientos_cuero=false;
        }
        
    }
    public String obtener_datos_generales(){
        return "Cantidad de ruedas: "+ruedas +" largo de la plataforma: " + largo_plataforma
         + " Tamaño del motor: "+ motor +" peso: " +peso;
    }

}
