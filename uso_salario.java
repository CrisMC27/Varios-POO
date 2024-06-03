package poo;
/**
 *
 * @author CristianM
 */
import java.util.Scanner;  
public class uso_salario
 
{

   public static void main(String[] args) {
   //declaracion variables
    int opcion=0, peso=0;
    String  nombre1="",apellido1="", id1="", cel1="";
    float valorh1=0, horas1=0, salario1=0, sueldo=0, altura=0; 
    
     //creacion de la capturadora y los objetos para cada clase
      Scanner sc = new Scanner(System.in);
   
      PTC plantatiempocompleto1= new PTC();   
      PMTD plantamdtiempodiurno1= new PMTD();
      PMTN plantamdtiemponocturno1= new PMTN();
      HC horacatedra1=new HC();
      
      lectura lee =new lectura();
      
      
      //mensajes de salida acerca de que hace el programa y las opciones del menu
      System.out.println("\n           CALCULA EL SALARIO DE PROFESORES \n");
      System.out.println("------------ Lectura de datos ------------");
      
      nombre1=lee.obtenerString("Escriba su nombre: ");       
      apellido1=lee.obtenerString("Escriba su apellido: ");
      id1=lee.obtenerString("Escriba su cedula: ");
      cel1=lee.obtenerString("Escriba su celular: ");
      peso=lee.obtenerEntero("Escriba su peso: ");
      altura=lee.obtenerFlotante("Escriba su altura: ");
      
     System.out.println("-----------------------------------------");
      
      System.out.println("DOCENTE A CALCULAR SALARIO: "+"\nPlanta tiempo completo = 1 \nPlanta medio tiempo diurno = 2 \nPlanta medio tiempo nocturno= 3 "
              + "\nHoras Catedra= 4\nSalir= 5 \nIngrese su opcion a escoger:" );
      
       //creacion del menu
      opcion= sc.nextInt();
      
     switch(opcion)
        {
         case 1:
             
             sueldo=lee.obtenerFlotante("Escriba su sueldo: ");
             plantatiempocompleto1.establecer_nombre(nombre1);
             plantatiempocompleto1.establecer_apellido(apellido1);
             plantatiempocompleto1.establecer_id(id1);
             plantatiempocompleto1.establecer_celular(cel1);
             plantatiempocompleto1.establecer_peso(peso);
             plantatiempocompleto1.establecer_altura(altura);
             plantatiempocompleto1.establecer_salario(sueldo);
             plantatiempocompleto1.calcula_salariobase(salario1);
             System.out.println(plantatiempocompleto1.obtener_datosgenerales());
             System.out.println("Su sueldo es: " +plantatiempocompleto1.obtener_salariobase());
             
             
        break;
        
         case 2:
             
             sueldo=lee.obtenerFlotante("Escriba su sueldo: ");
             plantamdtiempodiurno1.establecer_nombre(nombre1);         
             plantamdtiempodiurno1.establecer_apellido(apellido1);
             plantamdtiempodiurno1.establecer_id(id1);
             plantamdtiempodiurno1.establecer_celular(cel1);
             plantamdtiempodiurno1.establecer_peso(peso);
             plantamdtiempodiurno1.establecer_altura(altura);
             plantamdtiempodiurno1.establece_salario(sueldo);
             plantamdtiempodiurno1.calcula_salariobase(salario1);
             System.out.println(plantamdtiempodiurno1.obtener_datosgenerales());
             System.out.println("Su sueldo es: " +plantamdtiempodiurno1.obtener_salariobase());
                         
             break;   
             
         case 3:
             
             sueldo=lee.obtenerFlotante("Escriba su sueldo: ");
             plantamdtiemponocturno1.establecer_nombre(nombre1);         
             plantamdtiemponocturno1.establecer_apellido(apellido1);
             plantamdtiemponocturno1.establecer_id(id1);
             plantamdtiemponocturno1.establecer_celular(cel1);
             plantamdtiemponocturno1.establecer_peso(peso);
             plantamdtiemponocturno1.establecer_altura(altura);
             plantamdtiemponocturno1.establece_salario(sueldo);
             plantamdtiemponocturno1.calcula_salariobase(salario1);
             System.out.println(plantamdtiemponocturno1.obtener_datosgenerales());
             System.out.println("Su sueldo es: " +plantamdtiemponocturno1.obtener_salariobase());
             
             break;
             
         case 4:
             
             horacatedra1.establecer_nombre(nombre1);         
             horacatedra1.establecer_apellido(apellido1);
             horacatedra1.establecer_id(id1);
             horacatedra1.establecer_celular(cel1);
             horacatedra1.establecer_peso(peso);
             horacatedra1.establecer_altura(altura);
             horas1=lee.obtenerFlotante("Escriba el numero de horas de la catedra: ");
             horacatedra1.establece_horas(horas1);
             valorh1=lee.obtenerFlotante("Escriba el valor de las horas de catedra: ");
             horacatedra1.establece_valorhr(valorh1);
             horacatedra1.calcula_salariobase(salario1);
             System.out.println(horacatedra1.obtener_datosgenerales());
             System.out.println("Su sueldo es: " +horacatedra1.obtener_salariobase());
             break;
             
            case 5:
                System.out.println("Gracias y vuelva pronto");
                System.exit(0);
                break;
                
                }
               
       }
    
}