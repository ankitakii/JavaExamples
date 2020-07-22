package tutorial;

import java.util.Scanner;

public class Prime {
	
	private void Prnum(int n) {
		
		int count = 0 ; 
		if (n>1) {
			for (int i=1;i<=n;i++) {
				if(n%i==0)
					count++ ;
			}
			if(count == 2) {
       System.out.println(n+ " is a prime number ");	
			}
			else {
				System.out.println(n+ " is not a prime number ");
			}
			
		}
		
		else {
			System.out.println(n+ " is not a prime number ");
		}
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter number to check prime number");
		int n = s.nextInt();
		Prime obj = new Prime();
		obj.Prnum(n);
      
	}

}
