package tutorial;

import java.util.Scanner;

public class Swaping {
	
	
	public void  Swap(int a , int b) {
	
		int c;		
		c = b ;
		b = a ;
		a = c ;
		System.out.println("\nAfter swapping result of a = "+a+" and b = "+b);
	}

	public static void main(String[] args) {
		System.out.println("Please enter first no. for swapping");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("Please eneter second no. for swapping");
        int b=s.nextInt();
        System.out.println("\nBefore swapping a = "+a+" and b =" +b);
		Swaping obj = new Swaping();
		obj.Swap(a, b);

	}

}