class BouncyNum 
{
	public static void main(String[] args) 
	{
		System.out.println(isBouncyNum(1231));
	}
	public static boolean isBouncyNum(int n){
		boolean inc=false, dec=false;
		int last = n%10; //1
		int secLast = 9;

		while(n!=0){
			   // 2		3
			if(last<secLast){
				inc=true;
				//System.out.println(inc);
			}		//3      1
			else if(last>secLast)
				dec=true;
			n/=10; //12
			secLast=last;//3
			last=n%10; 
		}
		return inc&&dec;
	}
}
