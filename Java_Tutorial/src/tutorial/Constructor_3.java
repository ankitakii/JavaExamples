package tutorial;

public class Constructor_3 {

	public Constructor_3() {
		this(3,4,5);
		System.out.println("Default");
	}
	public Constructor_3(int a) {
		this(2,3);
		System.out.println("1 pr");
	}
	public Constructor_3(int a , int b) {
		this(6,7,8,4);
		System.out.println("2 pr");
	}
	public Constructor_3(int a , int b , int c) {
		System.out.println("3 pr");
	}
	public Constructor_3(int a , int b , int c , int d) {
		this();
		System.out.println("4 pr");
	}

	public static void main(String[] args) {
		Constructor_3 h = new Constructor_3(2); 

	}

}
