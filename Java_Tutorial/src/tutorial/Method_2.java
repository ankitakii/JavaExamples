package tutorial;

public class Method_2 {
	
	public void method6() {
		System.out.println("Parent default method");
		this.method7(1);
	   }
	public void method7(int a) {
		System.out.println("Parent 1 parameterized method");
		this.method9(1, 2, 3);
      	}
	public void method8(int a , int b) {
		System.out.println("Parent 2 parameterized method");	
		}
	public void method9(int a , int b , int c) {
	    System.out.println("Parent 3 parameterized method");
	    this.method8(1, 2);
		}
	public void method10(int a , int b , int c, int d) {
	    System.out.println("Parent 4 parameterized method");
	    this.method6();
		}
	public static void main(String[] args) {

	}

}
