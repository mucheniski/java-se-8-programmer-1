package pagina108;

// 4) Qual � a sa�da nos dois casos, respectivamente?

// a) Caelum e Caelum - Ensino e Inova��o .
class Exercicio4 {

	public static void main(String[] args) {
		String s = "Caelum";
		s.concat(" - Ensino e Inova��o");
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("Caelum");
		sb.append(" - Ensino e Inova��o");
		System.out.println(sb);
	}
	
}
