
public class TipoVariable { //es buena practica nombrar las clases con mayuscula al principio y usar cammel case
	
	public static void main (String[] args) {
		System.out.println("Hola mundo");
		
		int edad = 28;
		System.out.println(edad);
		
		edad = 47;
		System.out.println(edad);
		
		edad = 46 + 88;
		System.out.println("Mi edad " + edad);
		
		double salario = 1250.56;
		System.out.println(salario);
		
		double salarioMitad = salario / 2;
		System.out.println(salarioMitad);
		
		int regalos = 15;
		double personas = 2;
		System.out.println (regalos / personas);
		
		double variable1 = 230.89;
		int variable1Entero = (int) variable1; //Cast -> Forzamos una conversion
		
		System.out.println(variable1Entero);
		
		double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;

        System.out.println(total);
	}

}
