package practico8;

/*Dada una matriz de m x n enteros, ordenar cada una de sus filas*/

public class Ejercicio4 {

	static final int MAXROW = 3;
	static final int MAXCOL = 10;
	
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
	//funcion para buscar secuencias
	public static void searchSequence(int[][] matriz) {
		//inicio y fin de secuencias
		int start = -1, finish = -1;
		
		for(int i = 0; i < MAXROW; i++) {
			for(int j = 0; j < MAXCOL; j++) {
				
				if(matriz[i][j] != 0) {
					if(start==-1) {
						start = j;
						finish = j;
					}else {
						finish = j;
					}
				}else {
					if(start!=-1) {
						orderSequence(matriz, start, finish, i);
					}
					//Reiniciamos los contadores
					start = -1;
					finish = -1;
				}
			}
		}
	}
	//funcion para invertir secuencias
	public static void orderSequence(int[][] matriz, int start,
			int finish, int row) {
		
		int changeValue;
		for(int i=start; i <= finish; i++) {
			for(int j=start; j < finish; j++) {
				if(matriz[row][j] > matriz[row][j+1]) {
					changeValue = matriz[row][j];
					matriz[row][j] = matriz[row][j+1];
					matriz[row][j+1] = changeValue;
				}
			}
		}
	}
	public static void main(String[] args) {
		
		int[][] matriz = new int[MAXROW][MAXCOL];
		
		loadingMatriz(matriz);
		printMatriz(matriz);
		System.out.println("***ORDENANDO SECUENCIAS***");
		searchSequence(matriz);
		printMatriz(matriz);
	}

}
