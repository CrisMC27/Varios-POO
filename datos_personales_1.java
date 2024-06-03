package poo;

/**
 *
 * @author CristianM
 */
public class datos_personales_1 {
private String nombre, apellido, celular, id;
private int peso;
private float altura;
 
public datos_personales_1(){
}
 
public void establecer_nombre(String nom ){
    nombre=nom;
}

public void establecer_apellido(String ape ){
    apellido=ape;
}

public void establecer_celular(String cel){
    celular=cel;
}

public void establecer_id(String dni){
    id=dni;
}
public void establecer_peso(int pe){
    peso=pe;
}
public void establecer_altura(float alt){
    altura=alt;
}
public String obtener_nombre(){
    return nombre;
}
public String obtener_apellido(){
    return apellido;
}
public String obtener_celular(){
    return celular;
}
public String obtener_id(){
    return id;
}
public int obtener_peso(){
    return peso;
}
public float obtener_altura(){
    return altura;
}
public String obtener_datosgenerales(){
    return "Su nombre es: "+nombre +"\nSu apellido es: "+apellido+
            "\nSu celular es: "+celular+"\nSu cedula es: "+id+"\nSu peso es: "+peso+"\nSu altura es: "+altura;
}
}