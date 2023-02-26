
public class EjercicioFactorial {

	public static void main(String[] args) {

		for (int numero = 0; numero <= 10; numero++) {
			int facAcumulado = 1;
			int factorial = 1;
			
			if (numero == 0) {
				System.out.println("El numero actual es: 0\nSu valor factorial es: 0\n");
				
			} else {
				for (factorial = 1; factorial <= numero; factorial++) {
					
					facAcumulado *= factorial;
					//System.out.println("El factorial actual es: " + factorial);
				}
				
				System.out.println("El numero actual es: " + numero);
				System.out.println("Su valor factorial es: " + facAcumulado);
				System.out.println();
				
			}


		}
	}
}
