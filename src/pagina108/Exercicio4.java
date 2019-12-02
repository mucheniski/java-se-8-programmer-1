package pagina108;

// 4) Qual é a saída nos dois casos, respectivamente?

// a) Caelum e Caelum - Ensino e Inovação .
class Exercicio4 {

	public static void main(String[] args) {
		String s = "Caelum";
		s.concat(" - Ensino e Inovação");
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("Caelum");
		sb.append(" - Ensino e Inovação");
		System.out.println(sb);
	}
	
}
