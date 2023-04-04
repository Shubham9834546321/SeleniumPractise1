package constructor;

public class demo1 {
	demo1(){
		System.out.println("shrddha");
	}
	demo1(int a){
		System.out.println("harshad para");
	}
	demo1(int a,int b){
		System.out.println("shubham");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
demo1 c1=new demo1(2);//harshad
demo1 c2=new demo1();//shrddha
demo1 c3=new demo1(2,8);//shubham

	}

}
