package pagina108;

//13) Escolha a opção adequada ao tentar compilar e rodar o
//arquivo a seguir:
//	
//	a) Não compila.
//
//The method replace(char, char) in the type String is not applicable for the arguments (String, char)
//Está com aspas duplas no primeiro que é uma String e não char, deve ter 2 Strings ou 2 chars

class Exercicio13 {
	public static void main(String[] args) {
		String s = "estudando para a certificação";
		// s.replace("e", 'a');
		System.out.println(s);
	}
}
