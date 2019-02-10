package practico7;

public class Ejercicio08 {

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
	
	public static void searchSequence(int[] vector) {
		
		int start = -1;
		int finish = -1;
		int i = 0;
		boolean found = false;
		
		while((i < SIZE) && (!found)) {
			if(vector[i] != 0) {
				if(start == -1) {
					start = i;
					finish = i;
				}else {
					finish = i;
				}
			}else {
				if(start != -1) {
					found = true;
					System.out.println("Inicio: " + start + " Fin: " + finish);
				}
			}
			i++;
		}
	}
	
	public static void main(String[] args) {
		
		int[] vector = new int[SIZE];
		
		loadingVector(vector);
		printVector(vector);
		searchSequence(vector);
	}

}
