package pagina93;

public class Test {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.sum()); // 0
		System.out.println(c.sum(1)); // 1
		System.out.println(c.sum(1,2)); // 3
		System.out.println(c.sum(1,2,3,4,5,6,7,8,9));
	}
}
