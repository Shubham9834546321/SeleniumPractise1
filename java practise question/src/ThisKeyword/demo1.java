package ThisKeyword;

public class demo1 {
	int rollno=18;
	float fee=100;
	 demo1(int rollno, float fee) {		
		System.out.println("Local varibale: "+rollno);
		System.out.println("Local varibale: "+fee);
		System.out.println("Global varibale: "+this.rollno);
		System.out.println("Global varibale: "+this.fee);
		//global variable = local variable	
		this.rollno = rollno;
		this.fee = fee;
		System.out.println("Local varibale: "+rollno);
		System.out.println("Local varibale: "+fee);
		System.out.println("Global varibale: "+this.rollno);
		System.out.println("Global varibale: "+this.fee);
	}
	void display() {
		System.out.println(rollno + " " +  fee);	
	}

	public static void main(String[] args) {
		 demo1 s1 = new  demo1(111, 5000f);
		s1.display();//
		System.out.println("********************************");
	//	 demo1 s2 = new  demo1(112, 6000f);
	//	s2.display();//
	}
}
		
	


