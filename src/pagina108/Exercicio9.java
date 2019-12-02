package pagina108;

//9) Escolha a opção adequada ao tentar compilar e rodar o arquivo a seguir:
//
//d) Compila e dá erro de execução ao tentar criar a segunda
//String .
//
//Exception in thread "main" java.lang.NullPointerException
//at java.lang.String.<init>(String.java:847)
//at pagina108.Exercicio9.main(Exercicio9.java:6)

class Exercicio9 {
	public static void main(String[] args) {
		String s = null;
		String s2 = new String(s);
		System.out.println(s2);
	}
}
