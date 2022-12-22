import java.util.Scanner;

public class sokhonglienke {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        int t;
        t = input.nextInt();
        input.nextLine();
        while(t>0){
            String s;
            long test=0;
            int cout=0,check=0;
            s= input.nextLine();
            if(test(s,test)== true){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
    public static boolean test(String s,long test){
        test+=Character.getNumericValue(s.charAt(0));
        for(int i=1;i<s.length();i++){
            test+=Character.getNumericValue(s.charAt(i));
            if(Math.abs(Character.getNumericValue(s.charAt(i)) - Character.getNumericValue(s.charAt(i-1)) ) != 2){
                return false;
            }
        }
        if(test%10==0){
            return true;
        }
        else{
            return false;
        }
    }
}
