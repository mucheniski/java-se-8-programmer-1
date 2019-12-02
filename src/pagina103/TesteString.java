package pagina103;

//Esse c�digo imprime caelum em min�scula. Isso porque o
//m�todo toUpperCase n�o altera a String original. Na verdade,
//se olharmos o javadoc da classe String , vamos perceber que
//todos os m�todos que parecem modificar uma String na verdade
//devolvem uma nova.


//Para extrair peda�os de uma String , usamos o m�todo
//substring . Cuidado ao usar o m�todo substring com valores
//inv�lidos, pois eles jogam uma Exception . O segredo do m�todo
//susbtring � que ele n�o inclui o caractere da posi��o final, mas
//inclui o caractere da posi��o inicial:

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

