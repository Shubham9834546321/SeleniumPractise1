package SuperKeyword;

class aa {
	int i = 10;
	}
class bb extends aa {
	int i = 20;
void bb(int i) {
		System.out.println(super.i);
	}
}
public class example1 {
public static void main(String[] args) {
		bb e1=new bb();
		e1.bb(50);
		}
}
