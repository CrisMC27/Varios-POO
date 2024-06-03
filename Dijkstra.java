package poo;
public class Dijkstra {
//Daniel Segura y Cristian Martinez

static final int V  = 9;


private static int minDistance(int[] dist, boolean[] verticeYaProcesado)
{
   int min = Integer.MAX_VALUE; int min_index=0;

   for (int v = 0; v < V; v++)
     if (verticeYaProcesado[v] == false && dist[v] <= min) {
         min = dist[v];
         min_index = v;
      }

   return min_index;
}

private static void printSolution(int[] dist, int n, String[] trayecto)
{
   System.out.println("Distancia del vertice desde el origen\n");
   for (int i = 0; i < V; i++)
      System.out.println(i + " \t\t " + dist[i]+ " \t\t " + trayecto[i]);
}

private static void printCamino(String[] caminos){
	String caminoLargo="";
	for (int i=0; i<V;i++){
		if (caminos[i].length()>caminoLargo.length()){
			caminoLargo=caminos[i];
		}
	}
	System.out.println(caminoLargo);
}

private static void dijkstra(int[][] grafo, int src)
{
     int[] dist = new int[V];
    
     String[] caminos= new String[V];

     boolean[] verticeYaProcesado = new boolean[V];

     for (int i = 0; i < V; i++) {
        dist[i] = Integer.MAX_VALUE;
        verticeYaProcesado[i] = false;
     }
     dist[src] = 0;
     caminos[src]="0";

 
     for (int count = 0; count < V-1; count++)
     {

       
       int u = minDistance(dist, verticeYaProcesado);

       
       verticeYaProcesado[u] = true;

       
       for (int v = 0; v < V; v++)


         if (!verticeYaProcesado[v] && grafo[u][v] > 0 && dist[u] != Integer.MAX_VALUE
                                       && dist[u]+grafo[u][v] < dist[v]){

            dist[v] = dist[u] + grafo[u][v];

            caminos[v]= caminos[u]+"-"+v;
           }
     }


     printCamino(caminos);
}

public static void main(String[] args)
{
   int[][] graph = {{0, 4, 0, 0, 0, 0, 0, 8, 0},
                      {4, 0, 8, 0, 0, 0, 0, 11, 0},
                      {0, 8, 0, 7, 0, 4, 0, 0, 2},
                      {0, 0, 7, 0, 9, 14, 0, 0, 0},
                      {0, 0, 0, 9, 0, 10, 0, 0, 0},
                      {0, 0, 4, 0, 10, 0, 2, 0, 0},
                      {0, 0, 0, 14, 0, 2, 0, 1, 6},
                      {8, 11, 0, 0, 0, 0, 1, 0, 7},
                      {0, 0, 2, 0, 0, 0, 6, 7, 0}
                     };

    dijkstra(graph, 0);
}
}