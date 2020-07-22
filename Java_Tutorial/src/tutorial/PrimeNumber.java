package tutorial;

import java.util.Scanner;

public class PrimeNumber {
	
	
	public void  Prime(int n) {
	
		int count = 0;
		int m = n/2 ;
		
		for (int i = 2 ; i<=m ; i++ ) 
		{
			 if(n % i == 0) {
				count ++ ;
				break ;
			}
		}
			if(count == 0 && n != 1)
			{
				System.out.println(n+" is a prime number");
			}
			else {
				System.out.println(n+" is not a prime number");
			}
		}

	public static void main(String[] args) {
		System.out.println("Please enter number to check prime or not");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		PrimeNumber obj = new PrimeNumber();
		obj.Prime(n);

	}

}