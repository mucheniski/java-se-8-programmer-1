package pagina108;
// 1) Considere o seguinte c�digo dentro de um main :

// a) N�o compila.
// length n�o � par�metro, � um m�todo, precisa ser declarado com par�nteses length()

class Exercicio1 {
	public static void main(String[] args) {
		String s = "aba";
		for (int i = 0; i < 9; i++) {
			s = s + "aba";
		}
		// System.out.println(s.length);
	}
}
