package poo;

public class uso_vehiculo {
    public static void main(String[] args){
     /*   vehiculo modelo1= new vehiculo();
        modelo1.establece_color("rojo");*/
        
        camioneta camioneta1 = new camioneta(7, 350);
        camioneta1.establece_color("azul");
        camioneta1.establece_asientos_cuero("si");
        
        camioneta camioneta2 = new camioneta(5, 1500);
        camioneta2.establece_color("verde");
        camioneta2.establece_asientos_cuero("SI");
        
        automovil automovil1 = new automovil(5, 3, "mecanica");
        automovil1.establece_color("rojo");
        automovil1.establece_asientos_cuero("no");
        
     /* System.out.println("Datos vehiculo");
        System.out.println(modelo1.obtener_datos_generales());
        System.out.println(modelo1.obtener_color());
        System.out.println(modelo1.obtener_asientos_cuero());*/
        
        System.out.println("Datos camioneta modelo 1");
        System.out.println(camioneta1.obtener_datos_generales());
        System.out.println(camioneta1.obtener_datos_camioneta());
        System.out.println(camioneta1.obtener_color());
        System.out.println(camioneta1.obtener_asientos_cuero());
        
        System.out.println("Datos camioneta modelo 2");
        System.out.println(camioneta2.obtener_datos_generales());
        System.out.println(camioneta2.obtener_datos_camioneta());
        System.out.println(camioneta2.obtener_color());
        System.out.println(camioneta2.obtener_asientos_cuero());
        
        System.out.println("Datos automovil modelo 1");
        System.out.println(automovil1.obtener_datos_generales());
        System.out.println(automovil1.obtener_datos_automovil());
        System.out.println(automovil1.obtener_color());
        System.out.println(automovil1.obtener_asientos_cuero());
        
    }
    
}
