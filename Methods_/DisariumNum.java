class DisariumNum 
{
	public static void main(String[] args) 
	{
		System.out.println(isDisariumNum(175));
	}
	public static boolean isDisariumNum(int n){
		int cnt=count(n,0);
		int sum=0;
		for(int i=cnt,j=n;j>0;j/=10,i--){
			//System.out.println(i+" "+j%10);
			sum+=power(j%10,i);
			//System.out.println(sum);
		}
		return sum==n;
	}
	public static int count(int n,int ct){
		for(int i=n;i>0;i/=10)
			ct++;
		return ct;
	}
	public static int power(int n,int s){
		return s==0?1:n*power(n,s-1);
	}
}
