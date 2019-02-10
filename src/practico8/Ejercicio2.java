package practico8;

/*Dada una matriz de m x n enteros, insertar una fila en la posicion pos*/

public class Ejercicio2 {

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
	//funcion para insertar una fila en la posicion pos
	public static void insertRow(int[][] matriz, int row, int[] array) {
		
		for(int i=0; i < MAXCOL; i++) {
			matriz[row][i] = array[i];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz = new int[MAXROW][MAXCOL];
		int[] array = {8, 8, 8, 8, 8};
		
		loadingMatriz(matriz);
		insertRow(matriz, 2, array);
		printMatriz(matriz);
	}

}
