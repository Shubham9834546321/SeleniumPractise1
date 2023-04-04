package method;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123, rev=0, temp;
		for (; num > 0;) {
			temp = num % 10;
			rev = rev * 10 + temp;

			num = num / 10;
		}
		System.out.println(rev);
	}

}
