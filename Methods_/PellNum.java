class PellNum 
{
	public static void main(String[] args) 
	{
		System.out.println(pell(4));
	}
	
	public static int pell(int n)
	{
		if (n <= 2)
			return n;
		return 2 * pell(n - 1) + pell(n - 2);
	}

}
