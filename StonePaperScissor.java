package Methods;
import java.util.Scanner;

public class StonePaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bot="";
        String user="";

        
        int rNum = 0;
        int uNum=0;
        for( ; ; ){
            for(int i=0;i<3;i++){
                System.out.print("Enter a number between 1 to 3: ");
                uNum=sc.nextInt();
                if(uNum>=1 && uNum<=3){
                    user=options(uNum);
                    break;
                }else i--;
            }
    
            for(int i=0;i<3;i++){
                rNum = (int)(Math.random()*10);
                if(rNum>=1 && rNum<=3){
                    bot=options(rNum);
                    break;
                }else i--;
            }
            System.out.println("Bot : "+bot +"  User : "+user);
            System.out.println(result(rNum, uNum));
            break;
        }
    }
    public static String options(int n){
        switch(n){
            case 1:
                return "Stone";
            case 2:
                return "Paper";
        }
        return "Scissor";
    }

    public static String result(int bot, int user){

        if(bot==1&&user==3 || bot==2&&user==1 || bot==3&&user==2)return "User Win";
        if(bot==1&&user==2 || bot==2&&user==3 || bot==3&&user==1)return "Bot Win";
        return "DRAW";

    }



//     public static String userIp(Scanner sc){
//         System.out.print("Enter a number between 1 to 3: ");
//         int uNum=sc.nextInt();
//         String user = "";
//         for( ; ; ){
//             for(int i=0;i<3;i++){
//                 if(uNum>=1 && uNum<=3){
//                     user=options(uNum);
//                     break;
//                 }else i--;
//             }
//             break;
//     }
//     return user;
//   }


}
