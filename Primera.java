public class Primera {

	public static void main(String[] args) {
		
		int[][] matriz = {{30,6,10},{28,7,11},{26,0,11},{24,9,13},{22,10,15}};
		int[][] matrizX = new int[matriz[0].length][matriz.length];
		int x, y;
		
		for(x = 0; x < 5; x++){
			for(y = 0; y < 3; y++){
				System.out.print(matriz[x][y] + "\t");
			}
			System.out.println("");
		}
		System.out.println("");
		
		for (x = 0; x < matriz.length; x++){
			for (y = 0; y < matriz[x].length; y++){
				matrizX[y][x] = matriz[x][y];
			}
		}
		System.out.println("Matriz Traspuesta" + "\n");
		
		for(x = 0; x < matriz[x].length; x++){
			for(y = 0; y < matriz.length; y++){
				System.out.print(matrizX[x][y] + "\t" );
			}
			System.out.println();
		}
	}
}