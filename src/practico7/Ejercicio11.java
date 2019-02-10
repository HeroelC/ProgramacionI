package practico7;

/*Hacer un programa que elimine de un arreglo todas las ocurrencias
de una secuencia patrón dada por otro arreglo.*/

/*Comprobar que funcione verifySequence, consultar: ¿buscar secuen-
 * cias que tenga solo el tamaño de reemplazo?¿Como lo compruebo?*/

public class Ejercicio11 {

	final static int SIZE_A = 10;
	final static int SIZE_B = 3;
	
	//funcion para cargar el vector
	public static void loadingVector(int[] vector) {
			
		for(int i = 0; i < SIZE_A; i++) {
				
				if((i == 0) || (i == SIZE_A - 1)){
					vector[i] = 0;
				}else {
					vector[i] = (int) Math.floor(Math.random() * 10);
				}
				
		}
	}	
	//funcion para imprimir el vector
	public static void printVector(int[] vector) {
			
		for(int i = 0; i < SIZE_A; i++) {
				System.out.print(vector[i] + " ");
		}
			
			System.out.println();
	}
	//funcion para buscar secuencias distintas de cero.
	public static void searchSequence(int[] arrayA, int[] arrayB) {
		
		//Inicio y fin de secuencias.
		int start = -1, finish = -1;
		
		for(int i=0; i < SIZE_A; i++) {
			
			if(arrayA[i] != 0) {
				if(start == -1) {
					start = i;
					finish = i;
				}else {
					finish = i;
				}
			}else {
				if(start != -1) {
					if(verifySequence(arrayA, arrayB, start, finish)) {
						
					}
					//reiniciamos el inicio y fin de secuencias.
					start = -1;
					finish = -1;
				}
			}
		}
	}
	
	//funcion para verificar si cohincide la secuencia
	public static boolean verifySequence(int[] arrayA, int[] arrayB,
			int start, int finish) {
		
		//Match == cohincide
		boolean match = true;
		int i = 0;
		while((start <= finish) || (match)) {
			
			if(arrayA[start] != arrayB[i]) {
				match = false;
			}
			start++;
			i++; 
		}
		
		return match;
	}
	
	public static void main(String[] args) {
		
		int[] arrayA = new int[SIZE_A];
		int[] arrayB = new int[SIZE_B];

		
	}

}
