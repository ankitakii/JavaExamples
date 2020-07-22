package tutorial;

public class Arthemetic {
	
	public int sum(int a,int b) {
		int c =a +b ;
		return c;
		
	}
	
     public int sub(int x , int y) {
         int z = x - y;
		 return z;
}

     public int  mul(int m , int n) {
          int k = m * n ;
          
          return k;
	}
     public int div(int h , int i) {
    	 int t = h / i ;
    	 System.out.println("The final result is " +t);
    	 return t;
		
	}
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arthemetic obj = new Arthemetic();
		int sum_result = obj.sum(10,2);
		int sub_result = obj.sub(sum_result,2);
	    int mul_result = obj.mul(sub_result, 2);
	    int sum_result1 =obj.sum(mul_result, 2);
	    obj.div(sum_result1, 2);
	}

}
