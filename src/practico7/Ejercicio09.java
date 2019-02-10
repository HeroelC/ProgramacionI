package practico7;

public class Ejercicio09 {
	//tamaño del vector
	public static final int SIZE = 10;
	
	//funcion para cargar el vector
	public static void loadingVector(int[] vector) {
		
		for(int i = 0; i < SIZE; i++) {
			
			if((i == 0) || (i == SIZE - 1)){
				vector[i] = 0;
			}else {
				vector[i] = (int) Math.floor(Math.random() * 10);
			}
			
		}
	}
	
	//funcion para imprimir el vector
	public static void printVector(int[] vector) {
		
		for(int i = 0; i < SIZE; i++) {
			System.out.print(vector[i] + " ");
		}
		
		System.out.println();
	}
	
	public static void searchSequense(int[] vector) {
		
		int start = -1;
		int finish = -1;
		
		int maxStart = -1;
		int maxFinish = -1;
		
		for(int i = 0; i < SIZE; i++) {
			
			if(vector[i] != 0) {
				if(start == -1) {
					start = i;
					finish = i;
				}else {
					finish = i;
				}
			}else {
				if(start != -1) {
					if(finish - start >= maxFinish - maxStart) {
						maxStart = start;
						maxFinish = finish;
						start = -1;
						finish = -1;
					}
				}
			}
		}
		System.out.println("Inicio: " + maxStart + " Fin: " + maxFinish);
		
	}
	
	public static void main(String[] args) {
		
		int[] vector = new int[SIZE];
		
		loadingVector(vector);
		printVector(vector);
		searchSequense(vector);
	}

}
