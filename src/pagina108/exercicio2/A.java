package pagina108.exercicio2;

//2) Dada a seguinte classe: B
//O que acontece se chamarmos new B().imprime() ?
//
//
//b) Compila, mas d� exce��o na hora de rodar.
//A String msg est� null, ent�o 
//Exception in thread "main" java.lang.NullPointerException
//at pagina108.exercicio2.B.imprime(B.java:7)
//at pagina108.exercicio2.A.main(A.java:6)


public class A {

	public static void main(String[] args) {
		new B().imprime();
	}
	
}
