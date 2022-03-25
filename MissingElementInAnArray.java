package week1.day2.assignment;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {2,1,3,5,7,6,8};
	
		Arrays.sort(arr);
		
		int missingNumber,Total;
		
		Total=(arr.length+1) * (arr.length+2)/2;
		
		for(int i=0;i<=arr.length-1;i++) 
		{
			
			Total = Total - arr[i];
		}
		missingNumber= Total;
		System.out.println(missingNumber);
		
	  System.out.println("test");
			
	}

}
