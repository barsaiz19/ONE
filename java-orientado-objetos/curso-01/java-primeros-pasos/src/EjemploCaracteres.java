
public class EjemploCaracteres {

	public static void main(String[] args) {
		
		char caracter = 'a'; //Acepta solo un caracter. Se debe colocar con comillas simples
		System.out.println(caracter);
		
		caracter = 65; //Toma el valor del código ASCII
		System.out.println(caracter); //Imprime A
		
		caracter = 65 + 1; //Toma el valor del código ASCII
		System.out.println(caracter); //Imprime B
		
		//caracter = caracter + 3; -> No compila! Debido a Java transforma el resultado al tipo más grande, en este caso un INT
		//System.out.println(caracter); 
		
		caracter = 65 + 1; //Toma el valor del código ASCII 66 -> B
		char segundoCaracter = (char) (caracter + 1); //Hacemos Cast a la suma de 66 + 1 -> C
		System.out.println(segundoCaracter); //Imprime C
		
		//String -> Objeto de JAVA
		String palabra = "Alura cursos online";
		System.out.println(palabra);
		
		//Concatenación de String
		palabra = palabra + " 2023";
		System.out.println(palabra);
		
	}
}
