package ThisStatement;

public class example {
	example(){
		System.out.println("i am zero");
	}
	example(int a){
		
		System.out.println(" i am single");
	}
	example(int a ,int b){
		this();
		System.out.println("i am double");
	}

	public static void main(String[] args) {
		example c1=new example(5,5);
	//	example c2=new example();
		
		
		

	}

}
