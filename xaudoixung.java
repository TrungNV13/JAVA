import java.util.Scanner;

public class xaudoixung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            String s = sc.nextLine();
            int check=0;
            for(int i=0;i<s.length()/2;i++){
                if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                    check ++;
                }
            }
            if(s.length()%2!=0){
                System.out.println(check<=1 ? "YES" : "NO");
            }
            else if(s.length()%2==0){
                System.out.println(check==1 ? "YES" : "NO");
            }
        }
    }
}
