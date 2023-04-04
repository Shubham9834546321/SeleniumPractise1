package Pyramids;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub   
          for(int i=1;i<=4;i++) {         // i=3
        		                         //  j=3
        	  for(int j=3;j>=i;j--) {    //  k=3     //# # # *
        		  System.out.print(" ");             //# # * *
        	  }                                      //# * *
        	 // System.out.println();
        	  for(int k=1;k<=i;k++ ) {      
        		  System.out.print("*");
        	  }
        	  System.out.println();
          }
	}

}
