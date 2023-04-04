package totalRecall;

public class recall {
	int age = 25;
	static int empid = 552;
	{

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(empid);// static call

		recall e1 = new recall();
		System.out.println(e1.age);// non satic call
		add(25, 30);
		add3(25, 32, 52);// method overloading
		recall e2 = new recall(5, 5);// constructor

	}

	static void add(int a, int b) {// method
		int result = a + b;
		System.out.println(result);
	}

	static void add3(int a, int b, int c) {
		int result = a + b + c;
		System.out.println(result);
	}

	recall() {

		System.out.println("program start");
	}

	recall(int x, int y) {
		System.out.println(x * y);
	}

}
