package pagina108;

//5) Escolha a opção adequada ao tentar compilar e rodar o
//arquivo a seguir:
//
//Caso tente concatenar null com uma String , temos a
//conversão de null para String :
//	
//	e) Compila e imprime outro resultado que não foi mencionado
//	nessas alternativas.

class Exercicio5 {
	public static void main(String[] args) {
		String empty = null;
		String full = "Welcome " + empty;
		System.out.println(full); // Welcome null
	}
}
