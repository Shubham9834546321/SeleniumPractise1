package Stringex;

public class example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="I am from UP, I am workig in Accenture, I working as QA Deleivery Head";
		System.out.println("Actual String: "+s1);
		String[] strAry=s1.split(" ");
		for(String s:strAry) {
			System.out.println(s);

	}

}
}