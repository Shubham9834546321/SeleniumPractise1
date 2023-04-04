package ArrayAssignment;

public class frequencyFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int []{2,5,5,2,4,5,49,3,1,54,};
		int [] visitedarr=new int [arr.length];
		int visited=-1;
		for (int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					visitedarr[j]=visited;
				}
			}
			if(visitedarr[i]!=visited) {
				visitedarr[i]=count;
			}
		}
		for (int i=0;i<visitedarr.length;i++) {
			if(visitedarr[i]!=visited) {
				System.out.println("Frequency of "+arr[i]+" : "+visitedarr[i]);
			}
		}
	}
}


