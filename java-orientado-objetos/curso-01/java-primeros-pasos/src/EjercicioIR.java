//De 1900 a 2800 - IR = 7.5% - 142
//De 2800.0 a 3751 - IR = 15% - 350
//De 3751.01 a 4664 - IR = 22.5% - 636


public class EjercicioIR {
	
	public static void main(String[] args) {
		double salario = 1900;
		
		//Condiciones
		
		if (salario >= 1900 && salario <= 2800) {
			
			double porcentajeIR = 0.075;
			double deducibleNeto = salario*porcentajeIR;
			double maximoDeducible = 142;
			
			System.out.println("IR = 7.5% \nPuedes deducir hasta $142");
			
			if (maximoDeducible < deducibleNeto) {
				
				System.out.println("Tu deducible neto sería de: " + deducibleNeto + " Lamentablemente solo puedes deducir: " + maximoDeducible);
				
			} else {
				
				System.out.println("Tu salario es: " + salario + "\nDeducible: " + salario*porcentajeIR);
				
			}
			
			
		} else if (salario >= 2800.01 && salario <= 3751) {
			
			double porcentajeIR = 0.15;
			double deducibleNeto = salario*porcentajeIR;
			double maximoDeducible = 350;
			
			System.out.println("IR = 15% \nPuedes deducir hasta $350");

			if (maximoDeducible < deducibleNeto) {
				
				System.out.println("Tu deducible neto sería de: " + deducibleNeto + " Lamentablemente solo puedes deducir: " + maximoDeducible);
				
			} else {
				
				System.out.println("Tu salario es: " + salario + "\nDeducible: " + salario*porcentajeIR);
				
			}
			
			
		} else if (salario >= 3751.01 && salario <= 4664) {
			
			double porcentajeIR = 0.225;
			double deducibleNeto = salario*porcentajeIR;
			double maximoDeducible = 636;
			
			System.out.println("IR = 22% \nPuedes deducir hasta $636");

			if (maximoDeducible < deducibleNeto) {
				
				System.out.println("Tu deducible neto sería de: " + deducibleNeto + " Lamentablemente solo puedes deducir: " + maximoDeducible);
				
			} else {
				
				System.out.println("Tu salario es: " + salario + "\nDeducible: " + salario*porcentajeIR);
				
			}
		} else {
			System.out.println("El valor salarial ingresado es incorrecto, por favor, introduce un salario mayor a 1900 y menor a 4664");
		}
	}

}
