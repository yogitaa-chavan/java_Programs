class CountOfNum 
{
	public static void main(String[] args) 
	{
		int n = 12345;
		System.out.println(countOfNum(n,0));
	}
	public static int countOfNum(int n, int cnt){
		return n==0? cnt: countOfNum(n/10,++cnt);
	}
}
