package nonstatic_method;

public class simpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		simpleIntrest n1=new simpleIntrest();
		n1.simpleintrest(200,6,9);
	}
	 void simpleintrest (int p, int r,int t) {
		 double intrest=p*r*t;
		 double simpleIntrest=intrest/100;
		 System.out.println(simpleIntrest);
		
	}

}
