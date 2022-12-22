import java.util.Scanner;

public class tinhluythua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            long mod = 1000000007;
            long a,b;
            a= input.nextLong();
            b= input.nextLong();
            if(a==0 && b==0){
                break;
            }
            if(b==0){
                a=1;
            }
            long y=1;
            while(true){
                if(b==0 || b==1){
                    break;
                }
                if(b%2==0){
                    a=(a%mod * a%mod)%mod;
                    b/=2;
                }
                else{
                    y=(y%mod * a%mod)%mod;
                    b-=1;
                }
            }
            System.out.println((a%mod * y%mod)%mod);

        }
    }
}
