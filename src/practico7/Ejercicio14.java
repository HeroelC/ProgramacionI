package practico7;

/*Hacer un programa que busque una secuencia dada en un arreglo y le 
 * invierta el orden*/

public class Ejercicio14 {
	//CONSTANTES
	static final int SIZE = 10;
	//funcion para cargar con numeros randoms el array
	public static void loadingArray(int[] array) {
		
		for(int i = 0; i < SIZE; i++) {
			
			if((i == 0) || (i == SIZE - 1)){
				array[i] = 0;
			}else {
				array[i] = (int) Math.floor(Math.random() * 5);
			}
		}
	}
	//funcion para imprimir el array
	public static void printArray(int[] array) {
		
		for(int i = 0; i < SIZE; i++) {
			System.out.print(array[i] + " ");
		}
			
		System.out.println();
	}
	/*funcion para buscar secuencia, si hay secuencia de 3 numeros
	la invierte*/
	public static void searchSequence(int[] array) {
		
		int counter = 0;
		
		for(int i=0; i < SIZE; i++) {
			
			if(array[i] != 0) {
				counter++;
			}else {
				if(counter == 3) {
					reverseOrder(array, i-3, i);
				}
				counter = 0;
			}
		}
	}
	//funcion para invertir secuencia
	public static void reverseOrder(int[] array, int start, int finish) {
		
		int changeValue;
		
		for(int i = start; i < finish; i++) {
		
			changeValue = array[i];
			array[i] = array[finish];
			array[finish] = changeValue;
			
			finish--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrayA = new int[SIZE]; 
		
		loadingArray(arrayA);
		printArray(arrayA);
		searchSequence(arrayA);
		printArray(arrayA);
	}

}
