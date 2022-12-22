import java.util.Scanner;

public class chuanhoahoten1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine();
            for( String i:s.trim().split("\\s+")){
                System.out.print(i.substring(0,1).toUpperCase() + i.substring(1).toLowerCase()+ " ");
            }
            System.out.println();
        }
    }
}
