package recuperatorioSegundoParcialJunio2018;

/*Se tiene una matriz MAT de enteros de tamaño NFILxNCOL, donde en cada
 * fila se tiene secuencias de numeros distintos de cero separados por uno
 * o mas ceros. Realizar un programa que ordene de forma ascendente las 
 * últimas CANT secuencias*/

public class Main {

	static final int MAXROW = 2;
	static final int MAXCOL = 10;
	
	//funcion para cargar matriz con numeros randoms
	public static void loadingMatriz(int[][] matriz) {
		for(int i = 0; i < MAXROW; i++) {
			for(int j = 0; j < MAXCOL; j++) {
				
				if((j == 0) || (j == MAXCOL - 1)){
					matriz[i][j] = 0;
				}else {
					matriz[i][j] = (int) Math.floor(Math.random()*5);
				}
			}
		}
	}
	//funcion para imprimir una matriz
	public static void printMatriz(int[][] matriz) {
		
		for(int i = 0; i < MAXROW; i++) {
			for(int j = 0; j < MAXCOL; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	//funcion para buscar secuencias desde el final
	public static void searchSequence(int[][] matriz, int quantity) {
		
		int row = MAXROW-1;
		int start = -1;
		int finish = -1;
		//mientras las filas sean mayores o iguales a 0
		while((row >= 0) && (quantity > 0)) {
			
			int col = MAXCOL-1; //cantidad de columnas
			
			while((col >= 0) && (quantity > 0)) {
				if(matriz[row][col] != 0) {
					if(finish==-1) {
						start = col;
						finish = col;
					}else {
						start = col;
					}
				}else {
					if(start!=-1) {
						quantity--;
						System.out.println("INICIO: " + start +
								" FIN: " + finish + " FILA: " + row);
					}
					start = -1;
					finish = -1;
				}
				col--;
			}
			row--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = new int[MAXROW][MAXCOL];
		
		loadingMatriz(matriz);
		printMatriz(matriz);
		searchSequence(matriz, 2);
	}

}
