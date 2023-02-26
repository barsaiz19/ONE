
public class EjemploCiclos {
	public static void main(String[] args) {
		//Imprimir numeros del 1 al 10
		int contador = 0;
		
		while (contador <= 10) {
			System.out.println(contador);
			//contador = contador + 1; //Esta expresion puede ser cosiderada anti patron
			//contador += 1; //Alternativa a linea interior para incremento en la variable
			contador ++; //Alternativa para incrementar en 1
		}
	}
}
