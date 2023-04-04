package nonStaticVariable;

public class example1 {
int age=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=25;
		int b=10;
		int res=a+b;
	System.out.println(res);
		example1 n1=new example1 ();
		System.out.println(n1.age );//access nonstatic variable
		n1.age=50;
		System.out.println(n1.age);
		
		
		
	}
}