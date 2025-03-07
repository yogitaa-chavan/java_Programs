class SumOfDigit 
{
	public static void main(String[] args) 
	{
		int n=12821;
		System.out.println(sumOfDgt(n,0));
	}
	public static int sumOfDgt(int n, int sum){
		return n==0 ? sum: sumOfDgt(n/10 , sum+n%10);
	}
}
