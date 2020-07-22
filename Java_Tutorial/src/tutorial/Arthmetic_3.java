package tutorial;

public class Arthmetic_3 extends Arthemetic_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Arthmetic_3 obj1 = new Arthmetic_3();
	int mul_result = obj1.mul(10, 2);
	int sub_result = obj1.sub(mul_result, 2);
	int sum_result = obj1.sum(sub_result, 2);
	int sub_result1 = obj1.sub(sum_result, 2);
	obj1.div(sub_result1, 2);
	}
}
