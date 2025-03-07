class MagicNum2
{
	public static void main(String[] args) 
	{
		for(int i=0;i<1000;i++){
			if(isMagic(i))
			System.out.println(i);
		}
	}
	public static boolean isMagic(int n){ 
		int sum=sumOfDigit(n,0);
		if(sum<=9 && sum>1) return false; 

		return sumOfDigit(sum,0)==1;
	}

	public static int sumOfDigit(int n, int sum){
		return n==0? sum : sumOfDigit(n/10,sum+n%10);
	}
}
