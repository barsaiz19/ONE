
public class EjemploCiclosWhile {

	public static void main(String[] args) {

		int contador = 0;
		int acumulado = 0;

		while (contador <= 10) {
			// int acumulado = 0; // No funciona ya que dentro del ciclo se inicializa en
			// cada iteracion

			acumulado = acumulado + contador;

			// Imprime el total acumulado en cada iteracion
//			System.out.println(acumulado);
			contador++;
		}
		// declara solo el total al final
		System.out.println(acumulado);

	}
}
