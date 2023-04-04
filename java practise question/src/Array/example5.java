package Array;

public class example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 2, -9, 0, 5, 12, -25, 22, 9, 8, 12 };
		double sum=0;
		double avg;
		for(int number:numbers) {
			sum=sum+number;
		}
			System.out.println(sum);
			avg=sum/numbers.length;
			System.out.println(avg);
			
			
		}
	}

