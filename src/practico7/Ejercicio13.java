package practico7;

/*Hacer un programa que invierta el orden de los elementos de un arreglo*/

public class Ejercicio13 {
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
	
	public static void reverseOrder(int[] array) {
		
		int finish = SIZE - 1;
		int changeValue;
		
		for(int i = 0; i < finish; i++) {
			
			changeValue = array[i];
			array[i] = array[finish];
			array[finish] = changeValue;
			finish--;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[SIZE];
		
		loadingArray(array);
		printArray(array);
		reverseOrder(array);
		printArray(array);
	}

}
