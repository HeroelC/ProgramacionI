package practico7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Hacer un programa que elimine las secuencias de tamaño N de números
 * distintos de cero de un arreglo. Solicitar el valor de N al 
 * usuario.*/

public class Ejercicio10 {

	static final int SIZE = 10;
	
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
	
	//funcion para pedir un valor al usuario
	public static int askValue() {
	
		int number;
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("Ingrese la longitud a eliminar: ");
			number = new Integer(input.readLine());
		}catch(Exception e) {
			//Si ocurre algun error, el número se vuelve 0.
			number = 0;
		}
		
		return number;
	}
	
	public static void searchSequence(int[] vector, int value) {
		
		int start = -1;
		int finish = -1;
		
		for(int i = 0; i < SIZE; i++) {
			
			if(vector[i]!=0) {
				if(start == -1) {
					start = i;
					finish = i;
				}else {
					finish = i;
				}
			}else {
				//si entra aca es porque encontro un 0
				if(start != -1) {
					if(finish - start + 1 == value) {
						deleteSequence(vector, start, finish);
					}
					//reiniciamos los contadores.
					start = -1;
					finish = -1;
				}
			}
		}
	}
	
	public static void deleteSequence(int[] vector, int start, int finish) {
		
		for(int i=start; i <= finish; i++) {
			vector[i] = 0;
		}
	}
	
	public static void main(String[] args) {
		
		int[] vector = new int[SIZE];
		
		loadingVector(vector);
		printVector(vector);
		searchSequence(vector, askValue());
		printVector(vector);
	}

}
