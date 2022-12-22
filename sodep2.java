import java.util.Scanner;

public class sodep2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        int t1 = Integer.parseInt(t);
        while (t1-- > 0){
            String s = sc.nextLine();
            if(check_1(s) && check_2(s) && check_3(s)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
    public static boolean check_1(String s){
        if(s.charAt(0)=='8' && s.charAt(s.length()-1)=='8') return true;
        else return false;
    }
    public static boolean check_2(String s){
        long sum=0;
        for(int i=0;i<s.length();i++){
            sum+=Character.getNumericValue(s.charAt(i));
        }
        if(sum%10==0) return true;
        else return false;
    }
    public static boolean check_3(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }
}
