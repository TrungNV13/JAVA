import java.util.Scanner;

public class sotamphan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t;
        t= input.nextInt();
        input.nextLine();
        while(t>0){
            String s;
            s = input.nextLine();
            if(check(s)==true){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
            t--;
        }
    }
    public static boolean check(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!= '0' && s.charAt(i)!= '1' && s.charAt(i)!= '2' ){
                return false;
            }
        }
        return true;
    }
}
