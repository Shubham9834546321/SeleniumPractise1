package OverRiding;
class Animal{
void move(){
	System.out.println("animal can move");
		
	}
}
class dog extends Animal{
	//overRide
	void move() {
		System.out.println("dog can walk and run");
	}
	void bark() {
		System.out.println("Dog can bark");
	}
}

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog e1=new dog();
		e1.move();
		
	}

}
