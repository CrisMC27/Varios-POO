package poo;
/**
 *
 * @author CristianM
 */
import java.util.Scanner;

public class lectura
{
   public int obtenerEntero(String mensaje)
   {
    Scanner entrada = new Scanner(System.in);
    int x=0;
    int ban=0;
    while(ban==0){
        try{
            System.out.println(mensaje);
            x=entrada.nextInt();
            
            ban=1;
        }catch(Exception e){
            System.out.println("El valor debe ser un numero entero, intente nuevamente"); 
            entrada.nextLine(); //necesaria para que borre buffer
        }
     }   
   return x;
   }
   public float obtenerFlotante(String mensaje)
   {
    Scanner entrada = new Scanner(System.in);
    float x=0;
    int ban=0;
    while(ban==0){
        try{
            System.out.println(mensaje);
            x=entrada.nextFloat();
            
            ban=1;
        }catch(Exception e){
            System.out.println("El valor debe ser un numero entero o decimal, intente nuevamente"); 
            entrada.nextLine(); //necesaria para que borre buffer
        }
     }   
   return x;
   }
   public String obtenerString(String mensaje)
   {
    Scanner entrada = new Scanner(System.in);
    String x;
    System.out.println(mensaje);
    x=entrada.next();
    entrada.nextLine(); //necesaria para que borre buffer
    return x;
      }   
   }

