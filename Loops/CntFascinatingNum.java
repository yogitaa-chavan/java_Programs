class CntFascinatingNum 
{
	public static void main(String[] args) 
	{
		for(int k=1;k<1000;k++){
		String str = k +""+ k*2 + k*3;
		boolean flag=true;

		for(int i='1';i<='9';i++){
			int cnt=0;
			for(int j=0;j<str.length();j++){
				char ch=str.charAt(j);
				if(ch==i)
					cnt++;
				
			}
			if(cnt!=1)
			{
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println(k);
		//else
		//	System.out.println(num+" is not fascinating number");
		}
	}
}
