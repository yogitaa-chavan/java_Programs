class LCM 
{
	public static void main(String[] args) 
	{
		System.out.println(lcm(11,7));
	}
	public static int lcm(int n1, int n2) {
		int large = n1>n2?n1:n2;

		while(true){
			if(large%n1==0 && large%n2==0)
				return large;
			large++;
		}
	}
}
