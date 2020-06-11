package hackerank_problems;

import java.util.Scanner;

public class SubarrayProducts {

	public static void main(String[] args) {

		//int[] arr = {10,2,5,6,3};
		int n;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the N size for Array elements");
		n=sc.nextInt();
		int[] arr =new int[n];
		System.out.println("Enter the Array Elements");
		for (int i = 0; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the K value for subarray products must be <=K");
		int k=sc.nextInt();
		subarrayProducts(arr,k);
	}

	private static void subarrayProducts(int[] arr,int k) {

		int prod=1;
		int left =0;
		int right =0;
		int result =0;
		
		while(right < arr.length)
		{
			prod *= arr[right];
			
			while(prod >= k)
			{
				prod /= arr[left];
				left++;
			}
			
			result += (right-left) + 1;
			right++;
		}
		System.err.println("Number of Subarray products less than or equal to K are  -->  "+result);
	}

}
