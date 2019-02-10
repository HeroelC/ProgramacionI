package practico7;

public class Ejercicio04 {
	
	//tamaño del vector
	public static final int SIZE = 5;
	
	//funcion para cargar el vector
	public static void loadingVector(int[] vector) {
		
		for(int i = 0; i < SIZE; i++) {
			vector[i] = (int) Math.floor(Math.random() * 10);
		}
	}
	
	//funcion para imprimir el vector
	public static void printVector(int[] vector) {
		
		for(int i = 0; i < SIZE; i++) {
			System.out.print(vector[i] + " ");
		}
		
		System.out.println();
	}
	
	public static void runLeft(int[] vector, int pos) {
		
		for(int i=1; i <= pos; i++) {
			
			vector[i-1] = vector[i];
		}
		
		vector[pos] = 0;
	}
	
	public static void main(String[] args) {
		
		int[] vector = new int[SIZE];
		
		loadingVector(vector);
		printVector(vector);
		runLeft(vector, 2);
		printVector(vector);

	}

}
