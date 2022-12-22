import java.util.Scanner;

public class uocsonguyentolonnhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t;
        t = input.nextInt();
        while(t>0){
            long n,tmp=0;
            n= input.nextLong();
            for(int i=2;i<=Math.sqrt(n);i++){
                while(n%i==0){
                    tmp=i;
                    n/=i;
                }
            }
            if(n==1){
                System.out.println(tmp);
            }
            else {
                System.out.println(n);
            }
            t--;
        }
    }

}
