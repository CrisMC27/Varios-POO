
package poo;
import java.awt.Frame;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Scanner;

/**
 *
 * @author Cristian y Camila
 */
public class miMarco2 extends JFrame{
    public miMarco2(){
        
       setSize(500,500);

    }
    public void cambiarTamano1 (int ancho, int alto){
      
        setSize(ancho, alto);
    }
    
    public void cambiarPosicion (int px, int py){
        Toolkit miPantalla =Toolkit.getDefaultToolkit();        
        Dimension tamanoPantalla=miPantalla.getScreenSize();
        int alturap=tamanoPantalla.height;
        int anchop=tamanoPantalla.width;
        setLocation ((anchop-px)/4,(alturap-py)/4);
        setSize(anchop/2, alturap/2);
    }
    public void nombreVentana (String titulo){
        
        setTitle(titulo);
    }
    public void estableceDimension(int nwa, int nwb){
        
        setMinimumSize(new Dimension(nwa,nwb));
    }
    public void colorFondo (String Color){
 
    }
}
