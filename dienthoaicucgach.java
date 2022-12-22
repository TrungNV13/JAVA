import java.util.Scanner;

public class dienthoaicucgach {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s=sc.nextLine().toLowerCase();
            String res ="";
            for (int i=0;i<s.length();i++){
                if(s.charAt(i)=='a' || s.charAt(i)=='b' || s.charAt(i)=='c' ){
                    res+= "2";
                }
                else if(s.charAt(i)=='d' || s.charAt(i)=='e' || s.charAt(i)=='f' ){
                    res+= "3";
                }
                else if(s.charAt(i)=='g' || s.charAt(i)=='h' || s.charAt(i)=='i' ){
                    res+= "4";
                }
                else if(s.charAt(i)=='j' || s.charAt(i)=='k' || s.charAt(i)=='l' ){
                    res+= "5";
                }
                else if(s.charAt(i)=='m' || s.charAt(i)=='n' || s.charAt(i)=='o' ){
                    res+= "6";
                }
                else if(s.charAt(i)=='p' || s.charAt(i)=='q' || s.charAt(i)=='r' || s.charAt(i)=='s' ){
                    res+= "7";
                }
                else if(s.charAt(i)=='t' || s.charAt(i)=='u' || s.charAt(i)=='v' ){
                    res+= "8";
                }
                else{
                    res+="9";
                }
            }
            if(thuannghich(res)==true){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
    public static boolean thuannghich(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }
}
