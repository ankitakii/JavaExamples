package tutorial;

public class Student {

	int age ;
	int roll ;
	
	public static void display() {
		System.out.println("Welocome to all of you");
		}
	public static void print() {
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args) {
		
	Student ankit = new Student();
	ankit.age = 27 ;
	System.out.println(ankit.age);
	System.out.println(ankit.roll=25);
	ankit.display();
	ankit.print();
	}
	
}
