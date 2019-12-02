package pagina108;
// 1) Considere o seguinte código dentro de um main :

// a) Não compila.
// length não é parâmetro, é um método, precisa ser declarado com parênteses length()

class Exercicio1 {
	public static void main(String[] args) {
		String s = "aba";
		for (int i = 0; i < 9; i++) {
			s = s + "aba";
		}
		// System.out.println(s.length);
	}
}
