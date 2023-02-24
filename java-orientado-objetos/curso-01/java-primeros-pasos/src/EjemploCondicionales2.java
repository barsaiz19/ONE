
public class EjemploCondicionales2 {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int edad = 17;
		int cantidadPersonas = 2; //Hacemos más específica la variable  (Autoexplicativa)
		
		//boolean esPareja = true; //Los valores de boolean solo pueden ser true o false
		boolean esPareja = cantidadPersonas > 1; //Aplicamos la condición dentro de la variable y devolverá true o false dependiendo de la variable evaluada
		
		//Una alternativa a la condiconal sería
		//boolean puedeEntrar = edad >= 18 && esPareja;
		//if (puedeEntrar) {
		//	System.out.println("Usted puede entrar");
		//}
		
		if (edad >= 18 || esPareja) { //Los valores boolean no necesitan ser evaluados
			System.out.println("Usted puede entrar");
		} else {
				
				System.out.println("Usted no está autorizado a entrar");
			}
			
		}
		
	}