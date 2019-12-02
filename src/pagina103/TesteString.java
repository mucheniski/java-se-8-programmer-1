package pagina103;

//Esse código imprime caelum em minúscula. Isso porque o
//método toUpperCase não altera a String original. Na verdade,
//se olharmos o javadoc da classe String , vamos perceber que
//todos os métodos que parecem modificar uma String na verdade
//devolvem uma nova.


//Para extrair pedaços de uma String , usamos o método
//substring . Cuidado ao usar o método substring com valores
//inválidos, pois eles jogam uma Exception . O segredo do método
//susbtring é que ele não inclui o caractere da posição final, mas
//inclui o caractere da posição inicial:

public class TesteString {

	public static void main(String[] args) {
		String s = "caelum";
		s.toUpperCase();
		System.out.println(s); 
		
		String text = "Java";
		// Java
		System.out.println(text.substring(0, 4));
		// ava
		System.out.println(text.substring(1, 4));
		// Jav
		System.out.println(text.substring(0, 3));
		
		
		String text2 = "Certification";
		System.out.println(text2.compareTo("Aim"));
		System.out.println(text2.compareTo("certification")); // -32

	}
	
}

