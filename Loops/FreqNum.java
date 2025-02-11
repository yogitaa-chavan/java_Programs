class FreqNum 
{
	public static void main(String[] args) 
	{
		int num=1235124;
		for(int i=0;i<=9;i++){
			int cnt=0;
			for(int j=num;j>0;j/=10){
				int digit=j%10;
				if(digit==i){
					cnt++;
				}
			}
			if(cnt!=0){
				System.out.println(i+" : " +cnt);
			}
		}
		
	}
}
