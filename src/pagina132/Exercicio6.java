package pagina132;

/*6) Imprima a divisão por 0 de números inteiros e de números
com ponto flutuante:*/

public class Exercicio6 {

	public static void main(String[] args) {
		System.out.println(3 / 0);
		System.out.println(3 / 0.0);
		System.out.println(3.0 / 0);
		System.out.println(-3.0 / 0);
	}
	
}

/*Exception in thread "main" java.lang.ArithmeticException: / by zero
	at pagina132.Exercicio6.main(Exercicio6.java:9)
*/