package practico7;

public class Ejercicio06 {
	
	//tamaño del vector
	public static final int SIZE = 10;
	
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
	
	//funcion para eliminar un elemento
	public static void deleteNumber(int[] vector, int number) {
		
		int i = 0;
		boolean delete = false;
		
		while((i < SIZE) && (delete == false)) {
			
			if(number == vector[i]) {
				vector[i] = 0;
				delete = true;
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] vector = new int[SIZE];
		
		loadingVector(vector);
		printVector(vector);
		deleteNumber(vector, 5);
		printVector(vector);
	}

}
