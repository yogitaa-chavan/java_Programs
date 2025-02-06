import java.util.*;
class GameStone2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int rNum=0;
		int num = (int)(Math.random()*10);
		for( ; ; ){
			if(num>=1 && num<=3){
				rNum=num;
				break;
			}
		}
		String codeOpt=null;
		if(rNum==1){
			codeOpt="Stone";
		}else if(rNum==2){
			codeOpt = "PAPER";
		}else if(rNum==3){
			codeOpt = "SCISSR";
		}

		System.out.println("    Welcome");
		System.out.println("1.STONE  2.PAPER  3.SCISSOR");
		System.out.println();
		System.out.println("Enter a option ");
		int opt=sc.nextInt();
		

		String userOpt=null;
		if(opt==1){
			userOpt="Stone";
		}else if(opt==2){
			userOpt = "PAPER";
		}else if(opt==3){
			userOpt = "SCISSR";
		}else{
			System.out.println("Invalid option");
			return;
		}

		System.out.println("User  "+userOpt+ "    Bot  " + codeOpt);

		if((opt==1 && rNum==3) || (opt==2&&rNum==1) || (opt==3 && rNum==2)){
			System.out.println("User Wins");
		}
		else if((opt==1 && rNum==2) || (opt==2&&rNum==3) || (opt==3 && rNum==1)){
			System.out.println("Bot Wins");
		}
		else{
			System.out.println("draw");
		}
	}
}
