import java.util.Scanner;

public class kiemtrasofibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t;
        t= input.nextInt();
        while(t>0){
            long  n;
            n = input.nextLong();
            long[] a= new long[101];
            fibo(a);
            for(int  i=0;i<100;i++){
                if(a[i]==n){
                    System.out.println("YES");
                    break;
                }
                else if(a[i]>n){
                    System.out.println("NO");
                    break;
                }
            }
            t--;
        }
    }
    public static void fibo(long[] a){
        a[0]=0;
        a[1]=1;
        for(int i=2;i<100;i++){
            a[i]= a[i-1] + a[i-2];
        }
    }
}
