import java.util.Scanner;

public class catdoi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t;
        t = input.nextInt();
        input.nextLine();
        while(t>0){
            String s;
            long test =0,check=0,result=0;
            s = input.nextLine();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!= '0' && s.charAt(i)!= '1' && s.charAt(i)!= '8' && s.charAt(i)!= '9'){
                    test=1;
                    break;
                }
                else if (s.charAt(i) == '8' || s.charAt(i)== '9') {
                    check=0;
                }
                else if(s.charAt(i) == '0'  || s.charAt(i) == '1'){
                    check=Character.getNumericValue(s.charAt(i));
                }
                result = result*10 + check;
                check=0;
            }
            if(result == 0 || test==1){
                System.out.println("INVALID");
            }
            else{
                System.out.println(result);
            }
            t--;
        }
    }
}
