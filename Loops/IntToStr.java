import java.util.Scanner;
class IntToStr 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s="";
		System.out.println("Enter a num ");
		int num=sc.nextInt();
		String str="";
		int rem;//=num%10;
		while(num>0){
			rem=num%10;
		switch(rem){
			case 1:str="one";break;
			case 2: str="two";break;
			case 3: str="three";break;
			case 4: str="four";break;
			case 5: str="five";break;
			case 6: str="six";break;
			case 7: str="seven";break;
			case 8: str="eight";break;
			case 9: str="nine";break;
			
		}
		s=str+" "+s;
		num=num/10;
	}
	System.out.println(s);
}
}

/*switch(rem){
			case 1:word="one "+word;break;
			case 2:word="two "+word;break;
			case 3:word="three "+word;break;
			case 4:word ="four "+word;break;
			case 5:word ="five "+word;break;
			case 6:word ="six "+word;break;
			case 7:word ="seven "+word;break;
			case 8:word ="eight "+word;break;
			case 9:word ="nine "+word;break;
			
		}
		System.out.printl(num);
		System.out.printl(word); */
