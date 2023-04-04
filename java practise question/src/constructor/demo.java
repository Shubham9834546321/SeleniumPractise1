package constructor;

public class demo {
	demo(){
		System.out.println("zero para");
	}
	demo(int a){
		System.out.println("single para");
	}
	demo(int a,int b,int c){
		System.out.println("multiple para");
	}

	public static void main(String[] args) {
		demo c1=new demo(5,5,8);
		demo c2=new demo();
		

	}

}
