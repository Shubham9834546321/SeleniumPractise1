package Abstraction;

abstract class vehicle1 {
	abstract void start();
}

	class car extends vehicle1 {
		void start() {
			System.out.println("start with key");
		}
	}

	class bike extends car {
		void start() {
			System.out.println("start with kick");
		}
	}

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
car e1=new car();e1.start();
bike e2=new bike();
e2.start();

	}

}
