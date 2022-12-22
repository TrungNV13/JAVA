import java.util.Scanner;

public class souuthe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            int sum_chan=0;
            int sum_le=0;
            boolean check=true;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)<='9' && s.charAt(i)>='0'){
                    if(Character.getNumericValue(s.charAt(i))%2==0){
                        sum_chan++;
                    }
                    else {
                        sum_le++;
                    }
                }
                else {
                    check = false;
                }
            }
            if(check==false){
                System.out.println("INVALID");
            }
            else {
                if(sum_chan%2==0 && sum_chan> sum_le){
                    System.out.println("YES");
                }
                else if(sum_le%2!= 0  && sum_le>sum_chan){
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
        }
    }
}
