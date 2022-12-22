import java.util.Scanner;

public class sodep1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        int t1 = Integer.parseInt(t);
        while (t1-- > 0){
            boolean check = true;
            String s = sc.nextLine();
            for(int i=0;i<s.length()/2;i++){
                if(Character.getNumericValue(s.charAt(i))%2==0){
                    if(s.charAt(i)==s.charAt(i)){
                        if(s.charAt(i)==s.charAt(s.length()-i-1)){
                            continue;
                        }
                    }
                }
                else {
                    check = false;
                    break;
                }
            }
            if(check == true){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
