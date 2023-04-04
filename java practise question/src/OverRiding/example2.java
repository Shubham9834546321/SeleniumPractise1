package OverRiding;

class Animal1 {
	void move() {
		System.out.println("animal can move");
		}
}
class dog2 extends Animal1 {
	// overRide
	void move() {
		super.move();
		System.out.println("dog can walk and run");
	}
void bark() {
		System.out.println("Dog can bark");
	}
	}
public class example2 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog2 e1 = new dog2();
		e1.move();
}
}
