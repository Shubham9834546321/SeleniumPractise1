package logical;

public class ReverseString {

	public static void main(String[] args) {
		String name="Shubham";
	String	Rev=" ";
int len=name.length();
for(int i=len-1;i>=0;i--) {
	Rev=Rev+name.charAt(i);
	
}
System.out.println(Rev);

	}

}
