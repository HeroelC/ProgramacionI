package practico7;

/*
 * Haer un programa que cargue un arreglo (sin orden) de tamaño MAX = 10 con números enteros 
 * aleatorios entre 0 y 100. Finalmente imprima el arreglo por pantalla.
 * */

public class Ejercicio01 {

	static int SIZE = 10;
	
	public static void loadingVector(int[] vector) {
		
		for(int i = 0; i < SIZE; i++) {
			
			vector[i] = (int) Math.floor(Math.random() * 101);
		}
		
	}
	
	public static void printVector(int[] vector) {
		
		for(int i = 0; i < SIZE; i++) {
			System.out.print(vector[i] + " ");
		}
		
	}
	public static void main(String[] args) {
		
		int[] vector = new int[SIZE];
		
		loadingVector(vector);
		printVector(vector);
	}

}
