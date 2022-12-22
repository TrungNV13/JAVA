import java.util.Scanner;

public class chuanhoahoten2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine();
            String words[] = s.trim().split("\\s+");
            for(int i=1;i<words.length;i++){
                if(i == words.length-1) {
                    System.out.print(words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase() + ", "  );
                }
               else {
                    System.out.print(words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase() + " "  );
                }
            }
            System.out.println(words[0].substring(0).toUpperCase());
        }
    }
}
