package Array;

import java.util.Arrays;

public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
		int b[]=Arrays.copyOf(a, 3);
		System.out.println(b);

		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");

	}

}
}
