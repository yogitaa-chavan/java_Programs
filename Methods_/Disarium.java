class Disarium 
{
	public static void main(String[] args) 
	{
		int len=0,sum=0,num=89;  //135  //89
		int dup=num;
		for(int i=num;i>0;i/=10)
			len++;
		for(int i=num;i>0;i/=10){
			int dgt=i%10;
			int p=1;
			for(int j=1;j<=len;j++){
				p*=dgt;
			}
			sum+=p;
			len--;
		}
		System.out.println(dup==sum?"disarium no":"not");
	}
}
