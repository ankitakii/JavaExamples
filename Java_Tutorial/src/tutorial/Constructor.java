package tutorial;

public class Constructor {
	
	public Constructor () {
		this (1 ,2 , 3 ,4);
		System.out.println("I am default constructor");
	}

	public Constructor(int a) {
		this();
		System.out.println("I am 1 parameterized constructor");
	}
	
	public Constructor(int a , int b) {
		this (1,2,3);
		System.out.println("I am 2 parameterized constructor");
	}
	
	public Constructor (int a , int b , int c ) {
		this(51);
		System.out.println("I am 3 parameterized constructor ");
	}
	
	public Constructor (int a , int b , int c , int d ) {
		System.out.println("I am 4 parameterized constructor ");
	}
	

	public static void main(String[] args) {
	
		Constructor obj = new Constructor(1 ,2 );

	}
	}
