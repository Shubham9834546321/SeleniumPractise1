package casting;

public class ExplicitWidining {

	public static void main(String[] args) {
		int myint=25;
		double d=myint;            //widening --explicit
		System.out.println(d);
		System.out.println(myint);
		System.out.println("***********************************");
		double age=222.254;
		int x=(int )age;
		System.out.println(age);  //narrowing ----explicit
		System.out.println(x);

	}

}
