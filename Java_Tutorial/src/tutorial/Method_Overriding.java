package tutorial;

public class Method_Overriding extends Method_Overloading {

	public void Arthmetic(int a , int b) {
		int c = a + b;
		System.out.println(+c);
	}
	
	public static void main(String[] args) {
		Method_Overriding obj = new Method_Overriding();
		obj.Arthmetic(4,5);
		
		

	}

}
