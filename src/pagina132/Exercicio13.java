package pagina132;

public class Exercicio13 {

	public static void main(String[] args) {
		int i;
		for (i = 0; i < 5; i++) {
			if (i++ % 3 == 0) {
				break;
			}
		}
		System.out.println(i);
	}

}

// a) Imprime 1.
/*Primeiro faz a conta, depois incrementa, zero divido por 3 é zero*/