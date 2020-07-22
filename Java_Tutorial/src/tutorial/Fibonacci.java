package tutorial;

import java.util.Scanner;

public class Fibonacci {
	
	public void FibonacciSeries(int n) {
		
		int a =0,b=1;
		System.out.print(a+" "+b);
		
		int c = 0;
		for (int i=1 ;i<=n;i++) {
			
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
			
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter number get fibonaci series");
		int n = s.nextInt();
		Fibonacci obj = new Fibonacci();
		obj.FibonacciSeries(n);

	}

}
