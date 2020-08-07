public class Cuarta {

      public static void main(String[] args) {
        int[][] matriz=new int[12][12];
        
        matriz=generaMatriz(12,12);
        muestraMatriz(matriz);        
    }    
    static int[][] generaMatriz(int filas, int columnas){
        int i,j;
        int[][] matriz = new int[filas][columnas];
        for (i=0 ; i < matriz.length ; i++){
            matriz[i][0]=i;
            matriz[0][i]=i;
        }
        for (i=1 ; i < matriz.length ; i++){
            for (j=1 ; j < matriz[i].length ; j++){
               matriz[i][j]=i*j; 
            }
        }
        return matriz;
    }
    static void muestraMatriz(int[][] matriz){
        int i,j;
        
        for (i=0; i < matriz.length ; i++){
            for (j=0 ; j < matriz[i].length ; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}