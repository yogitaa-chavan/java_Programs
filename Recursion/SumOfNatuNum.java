class SumOfNatuNum 
{
	public static void main(String[] args) 
	{
		int n = 5;

		System.out.println(sumNatNum(n));
	}
	public static int sumNatNum(int n){
		if(n==1){
			return 1;
		}
		return n+sumNatNum(n-1);
	}
}
