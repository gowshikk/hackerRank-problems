package hackerank_problems;

import java.util.Scanner;

public class PerfectSubstring {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String numbers from 0 to 9");
		String s = sc.nextLine(); 
		System.out.println("Enter the k times the string must occur in each substring");
		int k = sc.nextInt(); 
		int result = findSubstrings(s, k); 
		System.err.println(result + " Perfect Substring are available in the String '"+s+"'");
		
	}

	private static int findSubstrings(String s, int k) {

		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			
			int[] freq = new int[10];
			
			for (int j = i; j < s.length(); j++) {
				
				int ind = s.charAt(j) - '0';
				freq[ind]++;
				
				if(freq[ind] > k)
				{
					break;
				}
				else if(freq[ind] == k && checkOtherFreq(freq , k) == true)
				{
					count++;
				}
			}
		}
		
		return count;
	}

	private static boolean checkOtherFreq(int[] freq, int k) {
		
		for (int i = 0; i < 10; i++) {
			if(freq[i] == 0 || freq[i]== k)
			{
				continue;
			}
			else
			{
				return false;
			}
		}
		
		return true;
	}

}
