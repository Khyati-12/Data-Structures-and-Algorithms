package Arrays;
import java.util.*;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Find the maximum and minimum element in an array
		Scanner scn = new Scanner(System.in);
		   int n=scn.nextInt();
		   int[] arr= new int[n];
		   for(int i=0;i<n;i++) {
			   arr[i]=scn.nextInt();
		   }
		   int max=arr[0]; 
		   int min=arr[0];
		   for(int i=0;i<n;i++) {
			   if(arr[i]>max) {
				   max=arr[i];
				   }
			   else if(arr[i]<min) {
				   min=arr[i];
			   }
		   }
		   System.out.println(max);
		   System.out.println(min);
	}

}
