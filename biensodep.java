import java.util.Scanner;

public class biensodep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(n--  > 0){
            String s = sc.nextLine();
            if(ascending(s) || equal(s) || equal_1(s) || lucky(s)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
    public static boolean ascending(String s){
        for(int i=5;i<s.length()-1;i++){
           if(i==8){
               continue;
           }
           else {
               if(i==7){
                   if(Character.getNumericValue(s.charAt(i+2))-Character.getNumericValue(s.charAt(i)) != 1){
                       return false;
                   }
               }
               else{
                   if (Character.getNumericValue(s.charAt(i+1))-Character.getNumericValue(s.charAt(i)) != 1) {
                       return false;
                   }
               }

           }
        }
        return true;
    }
    public static boolean equal(String s){
        for(int i=5;i<s.length()-1;i++){
            if(i==8){
                continue;
            }
            else {
                if(Character.getNumericValue(s.charAt(i+1))!=Character.getNumericValue(s.charAt(i)) ){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean equal_1(String s){
        for(int i=5;i<7;i++){
            if(Character.getNumericValue(s.charAt(i+1))!=Character.getNumericValue(s.charAt(i)) ){
                    return false;
            }
        }
        for (int i=9;i<s.length()-1;i++){
            if(Character.getNumericValue(s.charAt(i+1))!=Character.getNumericValue(s.charAt(i)) ){
                return false;
            }
        }
        return true;
    }
    public static boolean lucky(String s){
        for(int i=5;i<s.length();i++){
            if(i==8){
                continue;
            }
            else {
                if(s.charAt(i)!='6' && s.charAt(i)!='8'  ){
                    return false;
                }
            }
        }
        return true;
    }
}
