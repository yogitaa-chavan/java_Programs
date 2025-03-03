package Methods;

public class Alphabets {
    public static void main(String[] args) {
        printAtoZ();
        System.out.println();
        printzToa();
        System.out.println();
        printDgt();

    }
    public static void printAtoZ(){
        System.out.println("                  A to Z");
      
        for(char ch='A'; ch<='Z'; ch++){
            System.out.print(ch + " ");
        }
        System.out.println();
    }
    public static void printzToa(){
        System.out.println("                 z To a");
     
        for(char ch='z'; ch>='a'; ch--){
            System.out.print(ch + " ");
        }
        System.out.println();
    }
    public static void printDgt(){
        System.out.println("     0 To 9");

        for(char ch='0'; ch<='9'; ch++){
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}
