package SuperKeyword;
class w{
	void ww() {
		System.out.println("i am W class");
	}
}
class x extends w{
	
	void ww() {
		super.ww();
		System.out.println("i am x class");
	}
}

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
x e1=new x();
e1.ww();
	}

}
