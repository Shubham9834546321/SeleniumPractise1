package methodOverloading;

import day1.multiply;
import foor_loop.displayNo1to5;
import static_method.example2_withReturn;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		adder(25, 3);
		adder(25,3,25);
		example1.adder(35,84);
		
		multiply.mul(3,6);
		multiplyNumber.twoNumber(5,8);
		
		
	}

	static int adder(int a, int b) {
		int res = (a + b);
		System.out.println(res);
		return res;

	}

	static int adder(int a,int b,int c) {
		int res=(a+b+c);
		System.out.println(res);
		return res;
	}
	 }
