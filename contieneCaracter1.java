package poo;

import java.util.*;
import java.lang.*;
import java.io.*;

public class contieneCaracter1 {
    public static void main(String[] args) {
        String str = "cmartinezc7@ucentral.edu.co";
        char[] charSearch = {'@','.'}; 
        int [] contar= new int [2];
        contar[0]=0;contar[1]=0;
        
        for(int i=0; i<str.length(); i++) 
        {
            char chr = str.charAt(i);
            for(int j=0; j<charSearch.length; j++)
            {
                if(charSearch[j] == chr)
                {
                    //System.out.println("Char Value "+charSearch[j]+" is present in "+str); 
                    contar[j]= contar[j]+1;
                }
            }  
        }
        //System.out.println("La cantidad de simbolos @ es: "+contar[0]);
        //System.out.println("Char Value "+contar[1]); 
        if(contar[0]!=1 || contar[1]==0 || str.length()<3){
            System.out.println("El correo no es valido");
        }
        else{
            System.out.println("el correo es valido");
        }
    }
} 