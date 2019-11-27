package pagina90.exercicio2;

/*
2) Escolha a opção adequada ao tentar compilar e rodar o
arquivo a seguir:

b) Compila e 10 objetos do tipo B podem ser garbage
coletados ao chegar na linha do System.out .
*/

public class A {
	public static void main(String[] args) {
		B b = new B();
		for(int i = 0;i < 10;i++)
			b = new B();
		System.out.println("end!");
	}
}
