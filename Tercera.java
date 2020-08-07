public class Tercera {
  	public static void main(String[] args) {
		
		int[][] matriz = {{4,5,14,15,24},{3,6,13,16,23},{2,7,12,17,22},{1,8,11,18,21},{0,9,10,19,20}};
		int[][] matrizX = new int[matriz[0].length][matriz.length];
		int x, y;
		
		for(x = 0; x < 5; x++){
			for(y = 0; y < 5; y++){
				System.out.print(matriz[x][y] + "\t");
			}
			System.out.println("");
		}
		System.out.println("");
    }
}