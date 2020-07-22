package tutorial;

public class Method_3 extends Method_2 {
	
	public void method() {
		this.method1(1);
		System.out.println("Child default method");
	   }
	public void method1(int a) {
		this.method3(1, 2, 3);
		System.out.println("Child  1 parameterized method");		
      	}
	public void method2(int a , int b) {
		System.out.println("Child  2 parameterized method");	
		}
	public void method3(int a , int b , int c) {
		super.method10(1,2,3,4);
	    System.out.println("Child  3 parameterized method");	
		}
	public void method5(int a , int b , int c, int d) {
		this.method();
	    System.out.println("Child  4 parameterized method");	
		}
	public static void main(String[] args) {
		Method_3 obj = new Method_3();
		obj.method5(1, 2, 3, 4);	
	}
}
