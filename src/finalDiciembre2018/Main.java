package finalDiciembre2018;


/*
 Realizar un programa que dada una matriz MatSec de caracteres de tama�o
 MAXFxMAXC con filas compuestas de secuencias de caracteres distintos
 del caracter espacio (' '), elimine todas las secuencias que tienen orden
 ascendente entre sus caracteres. Para ello adem�s deber� tener en
 cuenta que cuando elimina una secuencia debe realizar un corrimiento
  a izquierda y completar con caracteres espacio (' ') al final de la fila.
 */

/*Preguntar lo del corrimiento �Desde que lugar? �para que?*/

public class Main {

	static char[] randomChar = {'A', 'B', 'C', 'D', ' '};
	
	//CONSTANTES
	static final int ROW = 1;
	static final int COL = 10;
	
	public static void loadingMatriz(char[][] matriz) {
		
		for(int i=0; i < ROW; i++) {
			for(int j=0; j < COL; j++) {
				
				if((j == 0) || (j == COL - 1)){
					matriz[i][j] = ' ';
				}else {
				 int randomNumer = (int) Math.floor(Math.random() * randomChar.length);
				 matriz[i][j] = randomChar[randomNumer];
				}
			}
		}
	}
	
	public static void printMatriz(char[][] matriz) {
		
		for(int i = 0; i < ROW; i++) {
			for(int j = 0; j < COL; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void searchSequence(char[][] matriz) {
		
		int start = -1;
		int finish = -1;
		
		for(int i = 0; i < ROW; i++) {
			for(int j = 1; j < COL; j++) {
				
				if(matriz[i][j] != ' '){
					if(start == -1) {
						start = j;
						finish = j;
					}else {
						finish = j;
					}
				}else {
					if(start != -1) {
						if(sequenceAsc(matriz, i, start, finish)) {
							deleteSequence(matriz, i, start, finish);
						}
					}					
					//Reseteamos valores
					start = -1;
					finish = -1;
				}
			}
		}
	}
	
	//Verifica si la secuencia esta ordenada ascendentemente
	public static boolean sequenceAsc(char[][] matriz, int row, int start, int finish) {
		
		boolean orderAsc = true;

			for(int i = start; i < finish; i++) {
				
				if(matriz[row][i] > matriz[row][i+1]) {
					orderAsc = false;
				}
			}
			
			return orderAsc;
	}
	
	//Elimina secuencias
	public static void deleteSequence(char[][] matriz, int row, int start, int finish) {
		
		for(int i = start; i <= finish; i++) {
			matriz[row][i] = ' ';
		}
	}
	
	public static void main(String[] args) {
		
		char[][] matriz = new char[ROW][COL];
		
		loadingMatriz(matriz);
		printMatriz(matriz);
		searchSequence(matriz);
		printMatriz(matriz);
	}

}
