package pagina85.exercicio1;

/*
1) Escolha a op��o adequada ao tentar compilar e rodar o
arquivo a seguir:

d) Compila e roda, imprimindo outro resultado.
*/

class A {
	public static void main(String[] args) {
		B b = new B();
		b.c = 10; // Vari�vel c
		System.out.println(b.c);
		b.c(30); // M�todo c
		System.out.println(b.c);
	}
}
