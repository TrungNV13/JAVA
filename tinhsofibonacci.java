import java.util.Scanner;

public class tinhsofibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t;
        t= input.nextInt();
        while(t>0){
            int n;
            n = input.nextInt();
            long[] a= new long[101];
            fibo(a);
            System.out.println(a[n]);
            t--;
        }
    }
    public static void fibo(long[] a){
        a[1]=1;
        a[2]=1;
        for(int i=3;i<100;i++){
            a[i]= a[i-1] + a[i-2];
        }
    }
}
