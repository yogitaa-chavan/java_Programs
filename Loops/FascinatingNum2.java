class FascinatingNum2 
{
	public static void main(String[] args) 
	{
		int num=327;
		int temp=num;
		boolean flag=true;
		for(int i=2;i<=3;i++){
			num=num*1000+temp*i;

		}
		for(int j='0';j<='9';j++){
			int cnt=0;
		for(int i=0;i<num;i++){
			if(i==j)
				cnt++;
		}
		if(cnt!=1){
			flag=false;
			break;
		}
		}
		if(flag)
			System.out.println("num is fascinating num");
		else
			System.out.println("num is not fascinating num");
	}
}
