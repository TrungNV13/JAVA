import java.util.Scanner;

public class xaudoixungdainhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0 ){
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            System.out.println(s1.equals(s2) ? "-1" : Math.max(s1.length(),s2.length()));
        }
    }
}
