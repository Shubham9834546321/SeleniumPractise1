package Stringex;
import java.util.Scanner;

import foor_loop.reverse_number;
public class example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="shubham";
		System.out.println(s1.charAt(2));
		for(int i=0;i<=s1.length();i++) {
			System.out.println(s1.charAt(i));
		}
		System.out.println("*******************");
		for(int i=s1.length()-1; i>=0;i--) {
			System.out.println(s1.charAt(i)); 
		}
		String s2="mumbai";
		System.out.println(rev(s2));
				
		}
}

	


