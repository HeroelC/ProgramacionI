package practico8;

/*Dada una matriz de m x n enteros, eliminar la fila de la posición pos*/

public class Ejercicio3 {

	static final int MAXROW = 5;
	static final int MAXCOL = 5;
	//funcion para cargar matriz con numeros randoms
	public static void loadingMatriz(int[][] matriz) {
		for(int i = 0; i < MAXROW; i++) {
			for(int j = 0; j < MAXCOL; j++) {
				
				if((j == 0) || (j == MAXCOL - 1)){
					matriz[i][j] = 0;
				}else {
					matriz[i][j] = (int) Math.floor(Math.random()*5);
				}
			}
		}
	}
	//funcion para imprimir una matriz
	public static void printMatriz(int[][] matriz) {
		
		for(int i = 0; i < MAXROW; i++) {
			for(int j = 0; j < MAXCOL; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	//funcion para eliminar una fila
	public static void deleteRow(int[][] matriz, int row) {
		
		for(int i = 0; i < MAXCOL; i++) {
			
			matriz[row][i] = 0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz = new int[MAXROW][MAXCOL];
		loadingMatriz(matriz);
		printMatriz(matriz);
		System.out.println("---Eliminando Fila---");
		deleteRow(matriz, 2);
		printMatriz(matriz);
	}

}
