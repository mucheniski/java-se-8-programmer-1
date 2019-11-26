package pagina82.exercicio2;

/*
2) Escolha a opção adequada ao tentar compilar e rodar o
arquivo a seguir:

f) Imprime 48.
*/

public class A {
	public static void main(String[] args) {
		B x = new B();
		B y = x;
		y.v++;
		x.v++;
		B z = y;
		z.v--;
		System.out.println(x.v + y.v + z.v);
	}
}
