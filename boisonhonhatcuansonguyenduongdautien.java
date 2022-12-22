import java.util.Scanner;

public class boisonhonhatcuansonguyenduongdautien {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        long t;
        t = input.nextLong();
        while(t>0){
            long n,result =1;
            n = input.nextLong();
            for(int i=1;i<=n;i++){
                result=result*i/uoc_max(result,i);
            }
            System.out.println(result);
            t--;
        }
    }
    public static long uoc_max(long a, long b) {
        if (a < b) {
            long temp = a;
            a = b;
            b = temp;
        }
        long r = 1;
        while (r != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
