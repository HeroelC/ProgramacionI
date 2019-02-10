package practico7;

public class Ejercicio05 {
	
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
	
	//funcion de ordenamiento decreciente burbuja
	public static void sortBubble(int[] vector) {
		
		int changeValue;
		
		for(int i=0; i < SIZE; i++) {
			for(int j=0; j < SIZE-1; j++) {
				
				if(vector[j] < vector[j+1]) {
					changeValue = vector[j];
					vector[j] = vector[j+1];
					vector[j+1] = changeValue;
				}
			}
		}
	}
	
	//funcion para insertar un valor
	public static void insertNumber(int[] vector, int number) {
		
		int i = 0;
		boolean insert = false;
		
		while((i < SIZE) && (insert == false)){
			if(number > vector[i]) {
				vector[i] = number;
				insert = true;
			}
			i++;
		}
	}
	
	public static void main(String[] args) {
		
		int[] vector = new int[SIZE];
		
		loadingVector(vector);
		sortBubble(vector);
		printVector(vector);
		insertNumber(vector, 5);
		printVector(vector);

	}

}
