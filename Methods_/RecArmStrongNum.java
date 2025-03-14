class RecArmStrongNum 
{
	public static void main(String[] args) 
	{
		System.out.println(isArmStrong(153,153,0));
	}
	public static boolean isArmStrong(int n, int temp, int sum){
		return temp==0 ? (n==sum) : isArmStrong(n,temp/10,sum+=power((temp%10),count(n,0)));
	}
	public static int count(int n, int ct){
		if(n==0) return ct;
		return count(n/10,++ct);
	}
	public static int power(int n, int ct){
		return ct==0? 1 : n*power(n,ct-1);
	}
}
