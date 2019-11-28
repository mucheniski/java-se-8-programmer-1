package pagina100;

/*
 1) Escolha a opção adequada ao tentar compilar e rodar o
arquivo a seguir:

e) O código compila e imprime gulherme .
 */

class Exercicio1 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("guilherme").delete(2, 3);
		System.out.println(sb);
	}
}
