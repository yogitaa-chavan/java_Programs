package Methods;
import java.util.Scanner;

public class AlphabetToDgt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next().toUpperCase();
        int res = alphaToDgt(n);
        System.out.println(res);
    }
    public static int alphaToDgt(String n){
        int num=0;
        for(int i=0;i<n.length();i++)
            num=26*num+(n.charAt(i)-'A'+1);
        return num;
    }
}
