/**
 *
 * @author cristian y camila
 */
package poo;
import java.util.Scanner;

public class uso_datos {
    
   public static void main(String[] args){
   
   Scanner sc = new Scanner(System.in);
   
    String  nombre1="",tipo_contrato1="", facultad1="", correo1="", carrera1="", jornada1="", materia1="", modalidad1="", cargo1="";
    float salario1=0, horas1=0;
    int edad1=0, cedula1=0;
    
    System.out.println("Datos estudiante");
    Estudiantes estudiante1= new Estudiantes();
    
    estudiante1.establece_carrera(carrera1);
    estudiante1.establece_modalidad(modalidad1);
    estudiante1.establece_nombre_completo(nombre1);
    estudiante1.establece_edad(edad1);
    estudiante1.establece_cedula(cedula1);
    
        System.out.println("Introduzca su carrera:");
         carrera1=sc.nextLine();
    
    System.out.println("Introduzca la modalidad de estudio:");
         modalidad1=sc.nextLine();
    
    System.out.println("Introduzca su nombre completo:");
         nombre1=sc.nextLine();
    
    System.out.println("Introduzca su edad:");
         edad1=sc.nextInt();
    
    System.out.println("Introduzca su cedula:");
         cedula1=sc.nextInt();
  
    System.out.println("El nombre del estudiante es: " + nombre1);     
    System.out.println("La edad del estudiante es: " + edad1);     
    System.out.println("La cedula del estudiante es: " + cedula1);
    System.out.println("La carrera del estudiante es: " +carrera1);     
    System.out.println("La modalidad de estudio del estudiante es: " + modalidad1);
   
    System.out.println("Datos Administrativo");
    Administrativos administrativo1=new Administrativos();
    
    administrativo1.establece_facultad(facultad1);
    administrativo1.establece_correo(correo1);
    administrativo1.establece_nombre_completo(nombre1);
    administrativo1.establece_edad(edad1);
    administrativo1.establece_cedula(cedula1);
    administrativo1.establece_cargo(cargo1);
    administrativo1.establece_tipo_contrato(tipo_contrato1);
   
    System.out.println("Introduzca su nombre completo:");
         nombre1=sc.nextLine();
    
    System.out.println("Introduzca su edad:");
         edad1=sc.nextInt();
    
    System.out.println("Introduzca su cedula:");
         cedula1=sc.nextInt();
   
    System.out.println("Introduzca su cargo:");
         cargo1=sc.nextLine();
    
    System.out.println("Introduzca su contrato:");
         tipo_contrato1=sc.nextLine();
          
    System.out.println("Introduzca su facultad:");
         facultad1=sc.nextLine();
    
    System.out.println("Introduzca su correo:");
         correo1=sc.nextLine();     
   
    System.out.println("El nombre del administrativo es: " + nombre1);
    System.out.println("La edad del administrativo es: " + edad1);
    System.out.println("La cedula del administrativo es: " + cedula1);
    System.out.println("El cargo del administrativo es: " + cargo1);
    System.out.println("El contrato del administrativo es: " + tipo_contrato1);
    System.out.println("La facultad del administrativo es: " + facultad1);
    System.out.println("El correo es: " + correo1);
    
    System.out.println("Datos docente planta");
    Docentes_planta docenteplt1= new Docentes_planta();
    
    docenteplt1.establece_jornada(jornada1);
    docenteplt1.establece_materia(materia1);
    docenteplt1.establece_cargo(cargo1);
    docenteplt1.establece_cedula(cedula1);
    docenteplt1.establece_edad(edad1);
    docenteplt1.establece_nombre_completo(nombre1);
    docenteplt1.establece_tipo_contrato(tipo_contrato1);
    
    System.out.println("Introduzca su nombre completo:");
         nombre1=sc.nextLine();
    
    System.out.println("Introduzca su edad:");
         edad1=sc.nextInt();
    
    System.out.println("Introduzca su cedula:");
         cedula1=sc.nextInt();
   
    System.out.println("Introduzca su cargo:");
         cargo1=sc.nextLine();
    
    System.out.println("Introduzca su contrato:");
         tipo_contrato1=sc.nextLine();
         
    System.out.println("Introduzca su facultad:");
         jornada1=sc.nextLine();
    
    System.out.println("Introduzca su correo:");
         materia1=sc.nextLine();     
   
    System.out.println("El nombre del docente de planta es: " + nombre1);
    System.out.println("La edad del docente de planta es: " + edad1);
    System.out.println("La cedula del docente de planta es: " + cedula1);
    System.out.println("El cargo del docente de planta es: " + cargo1);
    System.out.println("El contrato del docente de planta es: " + tipo_contrato1);
    System.out.println("La jornada del docente de planta es: " + jornada1);
    System.out.println("La materia del docente de planta es: " + materia1);
    
    System.out.println("Datos docente no planta");
    Docentes_hora docentehr1= new Docentes_hora();
    
    docentehr1.establece_horas_diarias(horas1);
    docentehr1.establece_salario(salario1);
    docentehr1.establece_cargo(cargo1);
    docentehr1.establece_cedula(cedula1);
    docentehr1.establece_edad(edad1);
    docentehr1.establece_nombre_completo(tipo_contrato1);
    docentehr1.establece_tipo_contrato(tipo_contrato1);
    
    System.out.println("Introduzca su nombre completo:");
         nombre1=sc.nextLine();
    
    System.out.println("Introduzca su edad:");
          edad1=sc.nextInt();
    
    System.out.println("Introduzca su cedula:");
         cedula1=sc.nextInt();
   
    System.out.println("Introduzca su cargo:");
         cargo1=sc.nextLine();
    
    System.out.println("Introduzca su contrato:");
         tipo_contrato1=sc.nextLine();
         
    System.out.println("Introduzca sus horas diarias:");
         horas1=sc.nextFloat();
    
    System.out.println("Introduzca su salario:");
         salario1=sc.nextFloat();     
   
    System.out.println("El nombre del docente es: " + nombre1);
    System.out.println("La edad del docente es: " + edad1);
    System.out.println("La cedula del docente es: " + cedula1);
    System.out.println("El cargo del docente es: " + cargo1);
    System.out.println("El contrato del docente es: " + tipo_contrato1);
    System.out.println("Las horas diarias del docente son: " + horas1);
    System.out.println("El salario del docente es: " + salario1);
    
   }
}
