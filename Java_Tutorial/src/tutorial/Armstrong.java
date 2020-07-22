package tutorial;

import java.util.Scanner;

public class Armstrong {
	
	
public void ArmstrongNumber(int n) {
		
		int s=0 , r;
		int t = n;
		
		while(n>0) {
			
		r= n%10 ;
		n=n/10;
		s=s+(r*r*r);
		}
		
		if(t==s)
		{
			System.out.println(t+ " is a armstrong numebr");
		}
		else {
			System.out.println(t+ " is not a armstrong numebr");
		}
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter number to check armstrong numebr");
		int n = s.nextInt();
		Armstrong obj = new Armstrong();
		obj.ArmstrongNumber(n);

	}

}
