package tutorial;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int num1 ;
		int num2 ;
		char operator ;
		double answer = 0.01 ;
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter 1st num");
		num1 = scan.nextInt();
		System.out.println("Enter 2nd num");
		num2 = scan.nextInt();
		System.out.println("Enter operator");
		operator = scan.next().charAt(0);
		
		switch(operator) {
		case '+' : answer = num1 + num2 ;
		break;
		case '-' : answer = num1 - num2 ;
		break;
		case '*' : answer = num1 * num2 ;
		break;
		case '/' : answer = num1 / num2 ;
		break;
		
		}
		
		System.out.println(num1+" "+operator+" "+num2+" = "+answer);


	}

}
