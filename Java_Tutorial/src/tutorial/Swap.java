package tutorial;

import java.util.Scanner;

public class Swap {
	
	public Swap(int a , int b) {
		
		int c ;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping a = "+a+" and b = "+b);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please eneter first number for swapping");
        int a = s.nextInt();
        System.out.println("Please eneter second number for swapping");
        int b = s.nextInt();
        System.out.println("Before swapping a = "+a+" and b = "+b);
        Swap obj = new Swap(a,b);
	}

}
