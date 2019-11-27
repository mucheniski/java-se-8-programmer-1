package pagina90.exercicio1;

/*
1) Escolha a opção adequada ao tentar compilar e rodar o
arquivo a seguir:

b) Compila e garbage coleta 10 objetos do tipo B na linha do
System.out
*/

class A {
	public static void main(String[] args) {
		B b;
		for (int i = 0; i < 10; i++)
			b = new B();
		System.out.println("end!");
	}
}
