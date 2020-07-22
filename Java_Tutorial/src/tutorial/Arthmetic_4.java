package tutorial;
import java.util.Scanner;
public class Arthmetic_4 {
	public int sum(int a , int b) {
		int c = a + b ;
		return c ;
	}
	public int sub(int d , int e ) {
		int f = d - e ;
		return f ;
	}
	public int mul(int g , int h) {
		int i = g * h ;
		return i ;
	}
	public void div(float j , float k) {
		float l = j / k ; ;
		System.out.println("The value of ((((x1+x2)-x3)+x4)*x5)/x6) is " +l);
	}
	public static void main(String[] args) {
		System.out.println("Please enter value of x1 ");
		Scanner s = new Scanner(System.in);
		int x1 =s.nextInt();
		System.out.println("Please enter value of x2 for adding");
		int x2 = s.nextInt();
		System.out.println("Please enter value of x3 for substarction");
		int x3 = s.nextInt();
		System.out.println("Please enter value of x4  for addition");
		int x4 = s.nextInt();
		System.out.println("Please enter value of x5 for multiplication");
		int x5 = s.nextInt();
		System.out.println("Please enter value of x5 for Divison");
		float x6 = s.nextFloat();
		Arthmetic_4 obj = new Arthmetic_4();
		int op1 = obj.sum(x1, x2);
		int op2 = obj.sub(op1, x3);
		int op3 = obj.sum(op2, x4);
		int op4 = obj.mul(op3, x5);
		obj.div(op4, x6);
			}
}
