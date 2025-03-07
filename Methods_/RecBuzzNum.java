class RecBuzzNum 
{
	public static void main(String[] args) 
	{
		System.out.println(isBuzz(28));
	}
	public static boolean isBuzz(int rem){
		if(rem%10==7) return true;
		return rem==0 ? rem==0 : isBuzz(rem%7); 
	}
}
