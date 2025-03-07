class RecNeonNum 
{
	public static void main(String[] args) 
	{
		System.out.println(isNeon(9,9));
	}
	public static boolean isNeon(int n,int temp){
		return temp==0?(n==lastDgtSqSum((n*n),0)) :isNeon(n,temp/10); // lastDgtSqSum((n*n),0)();
	}
	public static int lastDgtSqSum(int n,int sum){
		return n==0 ? sum : lastDgtSqSum(n/10,sum+n%10);
	}
}
