
public class EjemploCondicionales {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int edad = 17;
		int cantidad = 2;
		
		if (edad >= 18) { //Podemos omitir las llaves y se ejecutará como parte del ciclo solo la línea siguiente a la condicion
			System.out.println("Usted puede entrar");
		} else {
			if (cantidad >= 2) {
				System.out.println("Usted es menor de edad pero "
						+ "esta permitido su ingreso");
			} else {
				
				System.out.println("Usted no está autorizado a entrar");
			}
			
		}
		
	}
}
