package tutorial;

public class Arthemetic_2 {
	
	public int sum(int a , int b) {
		int c = a +b ;
		return c ;
		
	}
	public int sub(int x , int y) {
		int z = x-y;
		return z;
	
	}
    public int mul(int d , int e) {
	   int f = d * e ;
	   return f;
	
}
    public void div(int j , int k) {
    	int l = j  / k ;
    System.out.println("This is final result is  " + l);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Arthemetic obj = new Arthemetic();
         int sub_result = obj.sub(10, 2);
         int sum_result = obj.sum(sub_result, 2);
         int sum_result1 = obj.sum(sum_result, 2);
         int mul_result = obj.mul(sum_result1, 2);
         obj.div(mul_result, 2);
	}

}
