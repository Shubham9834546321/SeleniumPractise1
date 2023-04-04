package staticvariable;

public class example1 {
	static int age=25;//static variable

	public static void main(String[] args) {
		int a=25;
		int b=10;
		int res=a+b;
		System.out.println(res);
		System.out.println(age);
		age=28;//re-initialization
System.out.println(age);
	example1.age=37;//standard way initialization
	System.out.println(age);
	}
	}

