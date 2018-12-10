package segundoParcialProgramacionI;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 SEGUNDO PARCIAL PROGRAMACIÓN I - 17/05/2018
Se tiene una matriz MAT de enteros de tamaño 5x20, donde en cada fila se tiene secuencias de
números distintos de cero separadas por uno o mas ceros. Realizar un programa que para todas
las filas invierta el contenido de las secuencias que tienen tamaño N, y comienzan y terminan
con al menos un 1, siendo N un valor entero cargado desde teclado entre 0 y la cantida de
columnas.
*/

public class main {

	//CONTANTES
	final static int COL = 25;
	final static int FIL = 5;
	
	//Cargar valores random en la matriz
	public static void loadingMatriz(int[][] matriz) {
		
		for(int i=0; i < FIL; i++) {
			for(int j=0; j < COL; j++) {
				if((j == 0) || (j == COL - 1)) {
					
					matriz[i][j] = 0;
				}else{
					
				 matriz[i][j] = (int) Math.floor(Math.random() * 5);	
				}
				
			}
		}
		
	}
	
	//Imprimir la matriz
	public static void printMatriz(int[][] matriz) {
		for(int i=0; i < FIL; i++) {
			for(int j=0; j < COL; j++) {

				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	//Buscar secuencia con X size
	public static void searchSequence(int[][] matriz, int size) {
		
		int counter = 0;
		int start = 0;
		int finish = 0;

		for(int i=0; i < FIL; i++){
			for(int j=0; j < COL; j++) {
				
				if(matriz[i][j] != 0) {
					if(counter == 0) {
						start = j;
						counter++;
					}else {
						finish = j;
						counter++;
					}
				}else {
					
					if(counter == size) {
						reverseSequense(matriz, i, start, finish);
					}
					//Reseteamos todo los contadores
					start = 0;
					finish = 0;
					counter = 0;
				}
			}
		}
	}
	
	//Invertir secuencias
	public static void reverseSequense(int[][] matriz, int row, int start, int finish) {
		
		int changeValue;
		
		for(int i=start; i < finish; i++) {
			
			changeValue = matriz[row][i];
			matriz[row][i] = matriz[row][finish];
			matriz[row][finish] = changeValue;
			finish--;
		}
			
	}
	
	//Pedir valor al usuario
	public static int askValue() {
		
		int value;
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			do {
				System.out.println("¿Qué tamaño de secuencia desea reemplazar?");
				value = new Integer(input.readLine());
			}while((value < 0) || (value > COL));
			
		}catch(Exception e) {
			value = 0;
		}
		return value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matriz = new int[FIL][COL];
		
		loadingMatriz(matriz);
		
		printMatriz(matriz);
		
		searchSequence(matriz, askValue());
		
		printMatriz(matriz);
	}

}
