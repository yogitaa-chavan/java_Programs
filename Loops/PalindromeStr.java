import java.util.Scanner;
class PalindromeStr 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word  ");
		String str = sc.next();
		
		System.out.println();

		//1st App
		int n=str.length();
		for(int i=0;i<n/2;i++){
			if(str.charAt(i)!=str.charAt(n-i-1)){
				System.out.println("String is not a palindrome");
				break;
			}else{
				System.out.println("String is a palindrome");
			}

		}

		
		//2nd
		for(int i=0;i<n/2;i++){
			if(str.charAt(i)!=str.charAt(n-i-1)){
				System.out.println("String is not a palindrome");
				break;
			}else{
				System.out.println("String is a palindrome");
			}
		}




	}
}
  /*StringBuffer rev = new StringBuffer(str);
		String revStr = rev.reverse().toString();
		if(revStr.equals(str)){
			System.out.println("String is palindrome");
		}else{
			System.out.println("String is not palindrome");	
		}*/