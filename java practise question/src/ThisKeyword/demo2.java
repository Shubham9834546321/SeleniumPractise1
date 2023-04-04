package ThisKeyword;

public class demo2 {
	int x;
	// Constructor with a parameter
	public  demo2(int x) {
		this.x = x;
	}
	// Call the constructor
	public static void main(String[] args) {
		 demo2 myObj = new  demo2(5);
		System.out.println("Value of x = " + myObj.x);//
	}
}