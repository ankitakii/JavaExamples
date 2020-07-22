package tutorial;

public class Method {

	public void method() {
		System.out.println("I am default method");
		this.method4(1,2,3,4);
	   }
	public void method1(int a) {
		System.out.println("1 parameterized method");		
      	}
	public void method2(int a , int b) {
		System.out.println("2 parameterized method");	
		this.method1(1);
		}
	public void method3(int a , int b , int c) {
	    System.out.println("3 parameterized method");	
	    this.method();
		}
	public void method4(int a , int b , int c, int d) {
	    System.out.println("4 parameterized method");	
	    this.method2(1,2);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Method ankit = new Method();
       ankit.method3(1,2,3);
	}

}
