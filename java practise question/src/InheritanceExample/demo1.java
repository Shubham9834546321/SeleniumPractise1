package InheritanceExample;

class aa {
	int a = 25;
}
class bb extends aa {
	int a=30;
	void show(int a) {
		System.out.println(super.a);
		
	}
}
public class demo1 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		bb e1 = new bb();
		e1.show(10);
	}

}
