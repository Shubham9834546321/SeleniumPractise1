package Abstraction;

abstract class A {
	abstract void mobile();
}

class B extends A {
	void mobile() {
		System.out.println("Redmi");
	}
	}
class C extends A {
	void mobile() {
		System.out.println("vivo");
		}
	}
class D extends A {
	void mobile() {
		System.out.println("PoCo");
	}
}
public class demo1 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		D e1 = new D();
		e1.mobile();
		C e2 = new C();
		e2.mobile();
	}
}
