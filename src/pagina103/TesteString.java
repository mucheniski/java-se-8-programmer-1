package pagina103;

//Esse c�digo imprime caelum em min�scula. Isso porque o
//m�todo toUpperCase n�o altera a String original. Na verdade,
//se olharmos o javadoc da classe String , vamos perceber que
//todos os m�todos que parecem modificar uma String na verdade
//devolvem uma nova.

public class TesteString {

	public static void main(String[] args) {
		String s = "caelum";
		s.toUpperCase();
		System.out.println(s); 
	}
	
}

