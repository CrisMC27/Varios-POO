
package poo;
//import java.util.*;
public class Uso_suma {

   public static void main(String[] args) {
      int res,a,b,c;        
      Suma ObjSuma = new Suma();
      //suma dos numeros
      a=5;
      b=8;
      res=ObjSuma.operacion(a,b);
      System.out.println(a + " + " + b +" = "+res);
      a=5;
      b=6;
      c=9;
      res=ObjSuma.operacion(a,b, c);
      System.out.println(a + " + " + b +" + " + c +" = "+res);
    
       
    }
    
}

class Suma{

    public Suma(){
      
    }
    public int operacion(int n1, int n2){
        return n1+n2;
    }
    public int operacion(int n1, int n2, int n3){
        return n1+n2+n3;
    }
   

}