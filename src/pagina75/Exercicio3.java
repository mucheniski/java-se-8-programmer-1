package pagina75;

/*
3) Escolha a opção adequada ao tentar compilar e rodar o
arquivo a seguir:

d) Compila e imprime a mensagem de erro, ou imprime a idade.
*/

public class Exercicio3 {
	public static void main(String[] args) {
		int age;
		if (args.length > 0) {
			age = Integer.parseInt(args[0]);
		} else {
			System.err.println("???");
			return;
		}
		System.out.println(age);
	}
}
