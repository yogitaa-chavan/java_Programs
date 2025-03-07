class UniqueNum 
{
	public static void main(String[] args) 
	{
		System.out.println(isUnique(123456));
	}
	public static boolean isUnique(int n){
		int cnt=0;

		for(int j=0;j<=9;j++){
			cnt=0;

			for(int i=n;i>0;i/=10){
				if(j==i%10) cnt++;
			}

			//System.out.println(j+" "+cnt);
			if(cnt>1) return false;

	  }
	  return true;
	}

}
