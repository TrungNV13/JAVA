import java.util.Scanner;

public class sodep3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        int t1 = Integer.parseInt(t);
        while(t1-- >0){
            String s = sc.nextLine();
            if(check_1(s) && check_3(s)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
    public static boolean check_2(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static boolean check_1(String s){
        for(int i=0;i<s.length();i++){
            if(check_2(Character.getNumericValue(s.charAt(i)))==false){
                return false;
            }
        }
        return true;
    }
    public static boolean check_3(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }
}
