package ThisKeyword;

public class demo6 {
	int age;                       //global variable
	void display(int age) {     //local variable
		this.age=age;
	}
	void show() {
	System.out.println(age);	
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 demo6 c1=new  demo6();
		 
	c1.display(10);
	c1.show();

	
		
		
		
		
	}

}
