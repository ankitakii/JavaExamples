package tutorial;

import java.util.Scanner;

public class Factorial {
	
	public void FactorialNumber(int n) {
		
	double fact =1 ;
		
		for(int i=1;i<=n;i++) {
			
			fact = fact * i ;
					
		}
		
		System.out.println("The factorial of " +n+ " is " +fact);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter number get factorial");
		int n = s.nextInt();
		Factorial obj = new Factorial();
		obj.FactorialNumber(n);

	}

}
