package tutorial;

import java.util.Scanner;

public class Table {
	
	public void Tab(int n) {
		
		int s ; 

	for(int i = 1 ;i<= 10;i++ ) {
		
		 s = i * n ;
		 
	System.out.println(n+ " * " +i+ " = " +s);
	System.out.println("Print");
		
	}
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter number to for table");
		int n = s.nextInt();
		Table obj = new Table();
		obj.Tab(n);

	}

}
