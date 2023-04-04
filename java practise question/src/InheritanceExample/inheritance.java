package InheritanceExample;
class Ann {
	void parent() {
		System.out.println(" i am parent");
	}
}
class Bnn extends Ann{
	void child() {
		System.out.println(" i am child ");
	}
}

public class inheritance  {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bnn e1=new Bnn();
		e1.child();
	}

}
