
public class EjercicioMatriz {

	public static void main(String[] args) {

		/*
		 * //Imprime matriz de asteriscos for (int fila = 0; fila <= 10; fila++) { for
		 * (int columna = 0; columna <=10; columna++) {
		 * 
		 * System.out.print("*"); System.out.print(" ");
		 * 
		 * } System.out.println(); }
		 */

		// Imprime la seccion diagonal de la matriz
		for (int fila = 0; fila <= 10; fila++) {
			for (int columna = 0; columna <= 10; columna++) {

				if(columna > fila) {
					break;
				}
				
				System.out.print("*");
				System.out.print(" ");

			}
			System.out.println();
		}
	}
}
