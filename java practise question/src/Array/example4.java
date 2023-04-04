package Array;

public class example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,4,6,8,10,12,14};
		System.out.println(a.length);
		for(int i=0;i<a.length;i++) {
		System.out.print(a[i]);
		if(a[i]==12) {
			System.out.println(a[i]);
			break;
		}
		else {
			System.out.println("  is not 12");
		}
		}

	}

}
