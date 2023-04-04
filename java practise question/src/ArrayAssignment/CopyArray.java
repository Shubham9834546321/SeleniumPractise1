package ArrayAssignment;
import java.util.Arrays; 
public class CopyArray {

	public static void main(String[] args) {
		char copy []= {'a','b','a','d','e','f','g','t'};
		char copyto []=Arrays.copyOf(copy, copy.length);
		System.out.println(copyto); 
		
		for(int i=0;i<copy.length;i++) {
			System.out.println(copy[i]+" ");
			Arrays.sort(copy);
			
		}
		System.out.println("************************");	
		

	}
		
}

