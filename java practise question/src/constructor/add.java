package constructor;

public class add {
	add(){
		
	}
	add(int a,int b){
		int res=a+b;
		System.out.println(res);
	}
	add(int a){
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add c1=new add();
		add c2=new add(25,30);

	}

}
