package pagina103;

//Esse código imprime caelum em minúscula. Isso porque o
//método toUpperCase não altera a String original. Na verdade,
//se olharmos o javadoc da classe String , vamos perceber que
//todos os métodos que parecem modificar uma String na verdade
//devolvem uma nova.

public class TesteString {

	public static void main(String[] args) {
		String s = "caelum";
		s.toUpperCase();
		System.out.println(s); 
	}
	
}

