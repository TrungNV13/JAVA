import java.util.Scanner;

public class daotu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= Integer.parseInt(sc.nextLine());
        while(n-->0){
            String s[] = sc.nextLine().trim().split("\\s+");
            for (String i:s){
                StringBuilder str = new StringBuilder(i);
                System.out.print(str.reverse().toString() + " ");
            }
            System.out.println();
        }

    }
}
