import java.util.Scanner;

public class Segunda{

  public static void main (String[]Args){
    Scanner in = new Scanner(System.in);
         int matrizPrimera[][] = new int [3][3];
         int matrizSegunda[][] = new int [3][3];
         int matrizResultado[][] = new int [3][3];
         int i, j;
         
         Scanner dato = new Scanner (System.in);
         
         System.out.println("Datos de la Primera Matriz:");
         
         for (i=0; i<=2; i++){
             for (j=0; j<=2; j++){
                 System.out.print("Escribir valor por filas" + i + " , " + j + " : ");
                 matrizPrimera [i][j]= dato.nextInt();
                }
            }
            
            System.out.println("Datos de la Segunda Matriz:");
            
            for (i=0; i<=2; i++){
             for (j=0; j<=2; j++){
                 System.out.print("Escribir valor por filas" + i + " , " + j + " : ");
                 matrizSegunda [i][j]= dato.nextInt();
                }
            }
            
            for (i=0; i<=2; i++){
             for (j=0; j<=2; j++){
                 matrizResultado [i][j]= matrizPrimera[i][j]+matrizSegunda[i][j];
                }
            }
            
            System.out.println("Matriz resultante de la suma  Es :");
    for (i=0;i<=2;i++){
            for (j=0;j<=2;j++) {
                System.out.print(matrizResultado[i][j] + " ");
            }
            System.out.println("");
            
        }
    }
}