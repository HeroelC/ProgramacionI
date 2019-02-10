package practico7;

public class Ejercicio07 {
	
	//tamaño del vector
	public static final int SIZE = 10;
	
	//funcion para cargar el vector
	public static void loadingVector(int[] vector) {
		
		for(int i = 0; i < SIZE; i++) {
			vector[i] = (int) Math.floor(Math.random() * 10) + (10 * i);
		}
	}
	
	//funcion para imprimir el vector
	public static void printVector(int[] vector) {
		
		for(int i = 0; i < SIZE; i++) {
			System.out.print(vector[i] + " ");
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int[] vector = new int[SIZE];

		loadingVector(vector);
		printVector(vector);
	}

}
