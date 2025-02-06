class CondiOPerator 
{
	public static void main(String[] args) 
	{
		int a =22;
		int b=2;
		int c =47;

		int ch= (a>b) ? ((a>c)?(a):(c)) : ((b>c)?(b):(c));
		System.out.println("greatest number is "+ ch);
	}
}
