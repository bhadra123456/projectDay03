package dataType;

public class DataTypeDemo1 {

	public static void main(String[] args) {
		//integer data type ---> int
		int num1 = 11;
		int num2 = 22;
		int sum = num1 + num2;
		System.out.println("sum of num1 and num2 = " + sum);
		

		System.out.println("The code is working now...");

		System.out.println("This line added in bugfix code");
		
		int sub = num2 - num1;
		System.out.println("Diff of num2 from num 1 is: " + sub);
		
		int mul = num1 * num2;
		System.out.println("The multiple of "+num1+ " and "+num2+ " is "+mul);
		
		//Branch develop2
		float a = 2;
		float b = 3;
		float div = a/b;
		System.out.println("Div: "+div);
		

	}

}
