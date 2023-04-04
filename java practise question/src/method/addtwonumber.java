package method;

public class addtwonumber {

	public static void main(String[] args) {
		// TODO add two number
		add(10,20);
		 mul(5,10);
		 mul(5,5);
	}
static int add(int a,int b) {
	System.out.println(a);
	System.out.println(b);
	
	int res=a+b;
	System.out.println(res);
	return res;
}
static void mul(int a,int b) {
System.out.println(a);
System.out.println(b);
int res=a*b;
System.out.println(res);
}
}
