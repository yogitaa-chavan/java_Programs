class UglyNum2
{
	public static void main(String[] args) 
	{
		System.out.println(uglyNum(7));
	}
	public static boolean uglyNum(int n){
		while(n!=1){
			if(n%2==0)
				n/=2;
			else if(n%3==0)
				n/=3;
			else if(n%5==0)
				n/=5;
			else
				return false;
		}
		return true;
	}
}
