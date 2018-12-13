package finalSeptiembre;

public class Main {

	/*Realizar un programa que reemplace en una matriz MatSec de tama�o MAXFxMAXC con filas
	 * compuestas de secuencias, las ocurrencias de una sentencia patron dada en un arreglo Modelo
	 * de tama�o MAXA, por la secuencia contenida en el arreglo Reemplazo de tama�o MAXA.
	 * 
	 *  Observaciones:
	 *  
	 *  * Tener en cuenta que la secuencia de Reemplazo puede tener distinta longitud a la de Modelo.
	 *  * Suponer que MatSec, Modelo y Reemplazo est�n cargados.
	 *  * Cada fila de MatSec empieza y termina con uno o m�s ceros.
	 *  * Modelo y Reemplazo no empiezan con ceros y terminan con uno o m�s ceros.
	 *  * Los m�todos deben estar bien modularizados
	 *  */
	
	//CONSTANTES
	static int ROW = 5;
	static int COL = 5;
	static int SIZE = 3;
	
	//Funci�n para cargar valores random en la matriz
	public static void loadingMatriz(int[][] matriz) {
		
		for(int row = 0; row < ROW; row++) {
			for(int col = 0; col < COL; col++) {
				
				//Si se encuentra en la primera columna o en la �ltima se asigna 0
				if((col == 0) || (col == COL-1)){
					matriz[row][col] = 0;
				}else {
					matriz[row][col] = (int) Math.floor(Math.random() * 5);
				}
			}
		}
	}
	
	//Funci�n para imprimir la matriz
	public static void printMatriz(int[][] matriz) {
		
		for(int row = 0; row < ROW; row++) {
			for(int col = 0; col < COL; col++) {
				System.out.print(matriz[row][col] + " ");
			}
			//Salto de linea despu�s de imprimir cada fila
			System.out.println();
		}
	}
	
	//Funci�n para encontrar las secuencias
	public static void searchSequense(int[][] matriz) {
		
		//VARIABLES
		int start = 0;
		int finish = 0;
		boolean sequense = false;
		
		for(int row = 0; row < ROW; row++) {
			for(int col = 0; col < COL; col++) {
				
				if(matriz[row][col] != 0) {
					if(!sequense) {
						start = col;
						finish = col;
						sequense = true;
					}else {
						finish = col;
					}
				}else {
					
					//Tama�o de la secuencia
					int check = finish - start;
					
					//Si la secuencia es del mismo tama�o que la que estamos buscando.
					if(check == SIZE) {
						//Llamos a checkSequense para saber si cohincide lo que estamos buscando
						//Luego se va a llamar a reemplace sequense si devuelve true
					}
					System.out.println("Start: " + start + " Finish: " + finish);
					
					//Reiniciamos valores
					sequense = false;
				}
			}
		}
	}
	
	//Funci�n para chequear si cohincide la secuencia con el vector
	public static boolean checkSequense(int[][] matriz, int start, int finish, int row, int[] vector) {
		
		int counter = 0;
		
		for(int col = start; col <= finish; col++) {
			
			if(matriz[row][col] != vector[counter]) {
				return false;
			}
			
			counter++;
		}
		
		return true;
	}
	
	//Reemplazar la secuencia
	public static void replaceSequense() {
		
	}
	
	public static void main(String[] args) {
		
		int[][] matriz = new int[ROW][COL];
		int[] model = new int[SIZE];
		int[] remplace = new int[SIZE];
		
		loadingMatriz(matriz);
		
		printMatriz(matriz);
		
		searchSequense(matriz);
		
	}

}
