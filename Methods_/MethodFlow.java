class MethodFlow 
{
	public static void main(String[] args) 
	{

		System.out.println("Method Starts");
		add(70,30);
		division(10.0,100.0);
		System.out.println("Method End");

	}
	public static void add(int a , int b){
		int res =a+b;
		System.out.println("Addition Method Starts");
		System.out.println("Addition: "+res);
		System.out.println("add method ends");

	}
	public static void division(double den, double numerator){
		double res = numerator/den;
		System.out.println("division Method Starts");
		System.out.println("Division : "+res);		
		System.out.println("division method ends");



	}
}
