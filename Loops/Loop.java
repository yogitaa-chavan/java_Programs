class Loop 
{
	public static void main(String[] args) 
	{
		System.out.println("        Print Alphabets from A-Z");
		for(char ch='A';ch<='Z';ch++){
			System.out.print(ch+" ");
		}
		System.out.println();
		System.out.println("        Print Alphabets from z-a");
		for(char ch='z';ch>='a';ch--){
			System.out.print(ch+" ");
		}
		System.out.println();
		System.out.println("        Print Digits from 0-9");
		for(char ch='0';ch<='9';ch++){
			System.out.print(ch+" ");
		}
		System.out.println();
		System.out.println("        Print Ascii Table ");
		for(int i=0;i<=127;i++){
			System.out.print(i+" : "+(char)i+" ");
			//System.out.println(ch+" "+(ch*1));
			//System.out.println(ch+" "+(char)i);
		}
		System.out.println();

		System.out.println("       Print Numbers from 0-10");
		for(int i=1;i<=10;i++){
			System.out.println(i);
		}
	}
}
