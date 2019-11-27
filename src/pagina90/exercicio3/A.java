package pagina90.exercicio3;

/*
3) Escolha a opção adequada ao tentar compilar e rodar o
arquivo a seguir:

a) Compila e 100 objetos do tipo B são criados, mas não
podemos falar nada sobre o garbage collector ter jogado os objetos
fora na linha do System.out .
*/

class A {
	public static void main(String[] args) {
		B[] bs = new B[100];
		System.out.println("end!");
	}
}
