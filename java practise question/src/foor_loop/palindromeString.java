package foor_loop;

public class palindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input="abc";
String output="";
for(int i=input.length()-1;i>=0;i--)
	//System.out.println(input.charAt(i));
output=output+input.charAt(i);
System.out.println(output);
	}

}