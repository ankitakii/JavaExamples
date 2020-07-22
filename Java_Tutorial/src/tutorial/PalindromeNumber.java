package tutorial;

import java.util.Scanner;

public class PalindromeNumber {
	
	public void Palindrome(int n) {
		
		int s=0 , r;
		int t = n;
		
		while(n>0) {
			
		r= n%10 ;
		n=n/10;
		s=s*10+r;
		}
		
		if(t==s)
		{
			System.out.println(t+ " is a palindrome numebr");
		}
		else {
			System.out.println(t+ " is not a palindrome numebr");
		}
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter number to check palindrome number");
		int n = s.nextInt();
		PalindromeNumber obj = new PalindromeNumber();
		obj.Palindrome(n);

	}

}
