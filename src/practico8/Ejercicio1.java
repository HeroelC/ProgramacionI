package practico8;

/*Dada una matriz de 10x10 enteros, realiza los siguientes procedimientos
 * o funciones: 
 * Sumar una columna dada
 * Sumar una fila dada
 * Invierta el contenido entre las posiciones inicio y fin de una fila dada*/

public class Ejercicio1 {

	static final int MAXROW = 5;
	static final int MAXCOL = 5;
	
	public static void loadingMatriz(int[][] matriz) {
		
		for(int i = 0; i < MAXROW; i++) {
			for(int j = 0; j < MAXCOL; j++) {
				if((j == 0) || (j == MAXCOL - 1)){
					matriz[i][j] = 0;
				}else {
					matriz[i][j] = (int) Math.floor(Math.random() * 5);
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
	//funcion para sumar una fila dada
	public static int addRow(int[][] matriz, int row) {
		
		int total = 0;
		
		for(int i = 0; i < MAXCOL; i++) {
			
			total += matriz[row][i];
		}
		return total;
	}
	//funcion para sumar una columna dada
	public static int addCol(int[][] matriz, int col) {
		int total =0;
		
		for(int i=0; i < MAXROW; i++) {
			total += matriz[i][col];
		}
		return total;
	}
	//funcion para encontrar secuencias
	public static void searchSequence(int[][] matriz) {
		
		int start = -1, finish = -1, row = -1;
		
		for(int i=0; i < MAXROW; i++) {
			for(int j=0; j < MAXCOL; j++) {
				
				if(matriz[i][j]!=0) {
					if(start == -1) {
						//guardamos inicio, fin y fila de la secuencia
						start = j;
						finish = j;
						row = i;
					}else {
						finish = j;
					}
				}else {
					if(start != -1) {
						reverseOrder(matriz, start, finish, row);
					}
					/*Si entrá aca es que es 0, por
					 * lo tanto reiniciamos indicadores*/
					start = -1;
					finish = -1;
					row = -1;
				}
			}
		}
	}
	//funcion para revertir orden de secuencia
	public static void reverseOrder(int[][] matriz, int start,
			int finish, int row) {
		int changeValue;
		for(int i=start; i < finish; i++) {
			changeValue = matriz[row][i];
			matriz[row][i] = matriz[row][finish];
			matriz[row][finish] = changeValue;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matriz = new int[MAXROW][MAXCOL];
		
		loadingMatriz(matriz);
		printMatriz(matriz);
		System.out.println("...Secuencias invertidas...");
		searchSequence(matriz);
		printMatriz(matriz);
	}

}
