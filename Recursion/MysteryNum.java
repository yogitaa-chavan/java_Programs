class MysteryNum 
{
	public static void main(String[] args) 
	{
		System.out.println(isMystery(121));
		
	}
	public static boolean isMystery(int n){
		for(int i=1;i<=n/2;i++){
			int j=reverse(i);
				if((i+j) == n ){
					System.out.println(i+" "+j);
				return true;	
				}
		}
		return false;
	}
	public static int reverse(int num){
		int rev=0;
		while(num!=0){
			rev = rev*10+(num%10);
			num/=10;
		}
		return rev;
	}
	public static int power(int n, int raise){
		return raise==0 ? 1 : n*power(n,raise--);
	}
	public static int count(int n, int ct){
		return n==0 ? ct :count(n,ct++);
	}
}
