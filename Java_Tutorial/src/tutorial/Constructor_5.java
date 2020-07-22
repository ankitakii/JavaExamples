package tutorial;

public class Constructor_5 extends Constructor_4 {

	public Constructor_5() {
		this(1);
		System.out.println("Child default constructor");
		}
	public Constructor_5(int a) {
		this(1 , 2, 3);
		System.out.println("Child  1 parameterized constructor");
	}
	public Constructor_5(int a , int b) {
		System.out.println("Child  2 parameterized constructor");
	}
	public Constructor_5(int a , int b , int c) {
		super(1,2);
		System.out.println("Child  3 parameterized constructor");
	}
	public Constructor_5(int a , int b , int c , int d) {
		this();
		System.out.println("Child  4 parameterized constructor");
	}
	public static void main(String[] args) {
		Constructor_5 ankit = new Constructor_5(1 , 2 , 3, 4);
	}

}
