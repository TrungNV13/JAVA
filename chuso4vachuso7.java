import java.util.Scanner;

public class chuso4vachuso7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s;
        s= input.nextLine();
        int cout=0;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='4' || s.charAt(i)=='7'){
                cout++;
            }
        }
        if(cout == 4 || cout ==7){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
