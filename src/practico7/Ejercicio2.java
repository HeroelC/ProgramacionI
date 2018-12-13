package practico7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Implementar un método que busque la posición de un valor entero dado en un arreglo ordenado*/

public class Ejercicio2 {

	static int SIZE = 10;
	
	public static void loadingVector(int[] vector) {
		
		for(int i = 0; i < SIZE; i++) {
			vector[i] = (int) Math.floor(Math.random() * 10);
		}
	}
	
	public static void printVector(int[] vector) {
		
		for(int i = 0; i < SIZE; i++) {
			System.out.print(vector[i] + " ");
		}
		
		System.out.println();
	}
	
	public static void orderBubble(int[] vector) {
		
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE - 1; j++) {
				if(vector[j] > vector[j+1]) {
					int changeValue  = vector[j];
					 vector[j] = vector[j+1];
					vector[j+1] = changeValue;
				}
			}
		}
	}
	
	public static int searchValue(int[] vector, int value) {
	
		int counter = 0;
		
		while(counter < SIZE) {
			
			if(vector[counter]==value) {
				return counter;
			}
			
			counter++;
		}
		
		return -1;
	}
	
	public static int askValue() {
		
		int value;
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			System.out.println("¿Qué valor desea buscar?");
			
			value = new Integer(input.readLine());
			
		}catch(Exception e) {
			
			value = 0;
		}
		
		return value;
	}
	
	public static void main(String[] args) {
		
		int[] vector = new int[SIZE];
		
		loadingVector(vector);

		orderBubble(vector);
		
		printVector(vector);
		
		System.out.println(searchValue(vector, askValue()));
		
	}

}
