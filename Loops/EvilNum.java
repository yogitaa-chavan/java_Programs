import java.util.*;
class EvilNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number");
		int num = sc.nextInt();
		int dup=num;
		String bin = "";
		int cnt=0;
		for(int i=num;i>0;i/=2){
			int rem = num%2;
			bin=rem+bin;
		}

		for(int i=0;i<bin.length();i++){
			char ch=bin.charAt(i);
			if(ch=='1'){
				cnt++;
			}
		}
		if(cnt%2==0){
			System.out.print(dup+" is evil number");
		}
		else{
			System.out.print(dup+" is not evil number");
		}
	}
}
