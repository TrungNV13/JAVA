import java.util.Scanner;

public class solienke {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        int t;
        t = input.nextInt();
        input.nextLine();
        while(t>0){
            String s;
            int cout=0,check=0;
            s= input.nextLine();
            if(test(s)== true){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
    public static boolean test(String s){
        for(int i=1;i<s.length();i++){
            if(Math.abs(Character.getNumericValue(s.charAt(i)) - Character.getNumericValue(s.charAt(i-1)) ) != 1){
                return false;
            }
        }
        return true;
    }
}
