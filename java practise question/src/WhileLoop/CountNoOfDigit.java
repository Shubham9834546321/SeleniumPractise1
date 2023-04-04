package WhileLoop;

public class CountNoOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,num=325325;
		while(num!=0) {
		num=num/=10;
		++a;
		}
		System.out.println(a);
		

	}

}
