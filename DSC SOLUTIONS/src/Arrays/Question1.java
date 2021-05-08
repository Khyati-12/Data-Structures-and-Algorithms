package Arrays;
import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Reverse an array
   Scanner scn = new Scanner(System.in);
   int n=scn.nextInt();
   int[] arr= new int[n];
   for(int i=0;i<n;i++) {
	   arr[i]=scn.nextInt();
   }
   for(int i=0;i<n/2;i++) {
	   int temp=arr[i];
	   arr[i]=arr[n-i-1];
	   arr[n-i-1]=temp;
   }
   for(int i=0;i<n;i++) {
	   System.out.println(arr[i]);
   }

	}

}
