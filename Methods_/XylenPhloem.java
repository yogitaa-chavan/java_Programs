class XylenPhloem
{
	public static void main(String[] args) 
	{
		int n=2348;
		System.out.println(isXP(n));
	}
	


	public static boolean isXP(int n) {
    String str = Integer.toString(n);
    int es = 0, ms = 0;

    es += str.charAt(0) - '0';  
    es += str.charAt(str.length() - 1) - '0';  

    for (int i = 1; i < str.length() - 1; i++) {
        ms += str.charAt(i) - '0'; 
		}
	System.out.println(ms);
	System.out.println(es);

    return ms == es;
}

}
