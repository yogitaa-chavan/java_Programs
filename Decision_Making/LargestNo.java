class LargestNo 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=11;
		int c=20;
		int d=2;

		int temp=(a>b)?((a>c)?(a):(b)):((b>c)?(b):(c));

	//	int temp2=(a>b)  ?  ((a>c)?((a>d)(a):(d))) : ((b>d)?(b):(d))  :  ((b>c) ? ((b>d)?(b):(c)) : ((c>d)?(c):(d));

	int temp2 = (a > b) ? ((a > c) ? ((a > d) ? a : d) : ((c > d) ? c : d)) 
                    : ((b > c) ? b:c); //((b > d) ? b : d) : ((c > d) ? c : d));



    //int res=(a>b)?((a>c)?((a>d)?(a):(d)) :(b>c)?((b>d)?(b):(d)) : (c>d)?c:d);


		System.out.println(temp2);
	}
}
