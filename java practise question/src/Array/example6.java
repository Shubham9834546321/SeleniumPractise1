package Array;

public class example6 {
	static void min(int arr[]) {
		int min =arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println(min);
	}
	static void max(int arr[]) {
		int max=arr[0];
		for (int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		
int a[]= {10,20,14,18,30,5,78,32,84,};
example6.min(a);
example6.max(a);

	}

}
