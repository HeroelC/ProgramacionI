package practico7;

/*Hacer un programa que reemplace de un arreglo A todas las secuen-
 * cias de una secuencia patrón dada en un arrreglo P, por la secuen-
 * cia contenida en el arreglo R*/

/*NOTAS: ¿Deberia verificar que longitud tiene cada una?¿Qué se debe
 * tener en cuenta?*/

public class Ejercicio12 {
	
	static final int ARRAYA_SIZE = 10;
	static final int ARRAYP_SIZE = 3; //Secuencia patrón 
	static final int ARRAYR_SIZE = 3; //Secuencia reemplazo
	
	//funcion para cargar de numeros random el arreglo
	public static void loadingVector(int[] vector) {
		
		for(int i = 0; i < ARRAYA_SIZE; i++) {
			
			if((i==0) || (i==ARRAYA_SIZE - 1)) {
				vector[i] = 0;
			}else {
				vector[i] = (int) Math.floor(Math.random() * 5);
			}
		}
	}
	
	//funcion para imprimir el vector
	public static void printVector(int[] vector) {
			
		for(int i = 0; i < ARRAYA_SIZE; i++) {
				System.out.print(vector[i] + " ");
		}
			
			System.out.println();
	}
	
	//funcion para buscar las secuencias
	public static void searchSequence(int[] arrayA, int[] arrayP,
			int[] arrayR) {
		
		int start = -1, finish = -1;

		for(int i=0; i < ARRAYA_SIZE; i++) {
			
			if(arrayA[i]!=0) {
				if(start==-1) {
					//Asignamos inicio y fin de secuencia
					start = i;
					finish = i;
				}else {
					//Si ya existe el incio aumentamos el fin
					finish = i;
				}
			}else {
				if(start!=-1) {
					if(verifySequence(arrayA, start, finish, arrayP)) {
						changeSequence(arrayA, start, finish, arrayR);
					}

				}
				//Reiniciamos los valores de inicio y fin
				start = -1;
				finish = -1;
			}
		}
	}
	
	//funcion para verificar si la secuencia cohincide con el patrón
	public static boolean verifySequence(int[] arrayA, int start,
			int finish, int[] arrayP) {
		
		boolean match = true; //match = cohincide
		int i = 0;
		
		while((start <= finish) && (match)) {
			
			if(arrayA[start] != arrayP[i]) {
				match = false;
			}
			i++;
			start++;
		}
		
		return match;
	}
	
	//función para reemplazar secuencias
	public static void changeSequence(int[] arrayA, int start,
			int finish, int[] arrayR) {
		
		int j = 0;
		
		for(int i=start; i <= finish; i++) {
			arrayA[i] = arrayR[j];
			j++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrayA = {0, 1, 2, 3, 0, 0, 1, 2, 3, 0};
		int[] arrayP = {1, 2, 3};
		int[] arrayR = {4, 5, 6};
		
		searchSequence(arrayA, arrayP, arrayR);
		printVector(arrayA);
	}

}
