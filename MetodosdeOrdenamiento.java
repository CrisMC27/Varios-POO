package poo;

/**
 *
 * @author cristian martinez y daniel segura
 */
public class MetodosdeOrdenamiento{
    public static void main(String[] args){
        int[] v= {5, 8, 9, 7, 22, 53, 17, 10, 4, 56, 66, 77, 98, 89, 12, 16, 17, 32, 19, 52};
        burbuja(v);
        shake(v);
    }
public static void burbuja(int v[]){
    int i, j=0, c, n=20, ban=0;
    for(i=0; i<n-1; i++){
        for(j=i+1;j<n;j++){
            if(v[i]>v[j]){
                c=v[i];
                v[i]=v[j];
                v[j]=c;
                ban = 1;
            }
        }
        if(ban== 0) break;
        imprimir(v);
    }
  }
public static void shake (int v[]){
    int i, j, c, n=20;
    for(i=0; i<n-1; i++){
        for(j=0; j<n-1;j++){
            if(v[j+1]< v[j]){
                c=v[j+1];
                v[j+1]=v[j];
                v[j]=c;        
        }
    }
        imprimir(v);
}

}
public static void imprimir(int v[]){
    for(int i=0; i < v.length; i++){
        System.out.print(v[i]+" ");
        System.out.print(" ");
    }
}
}

