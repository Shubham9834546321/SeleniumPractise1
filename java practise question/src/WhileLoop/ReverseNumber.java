package WhileLoop;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 123;
		int b = 0;
		while (a != 0) {
			int C = a % 10;
			b = b * 10 + C;
			a = a / 10;
			}
		System.out.println(b);
}
}
