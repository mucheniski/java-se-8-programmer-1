package pagina132;

// 12) Qual é o resultado do código a seguir?

public class Exercicio12 {

	public static void main(String[] args) {
		int i;
		for (i = 0; i < 5; i++) {
			if (++i % 3 == 0) {
				break;
			}
		}
		System.out.println(i);
	}

}

// c) Imprime 3.
