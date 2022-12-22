import java.util.Scanner;

public class diemcanbang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t;
        t = input.nextInt();
        while(t>0){
            int n,result=0,tmp=0;
            long sum=0,sum1=0;
            n = input.nextInt();
            long[] a = new long[n];
            for(int i=0;i<n;i++){
                a[i] = input.nextInt();
                if(i>0){
                    sum+=a[i];
                }
            }
            for(int i=1;i<n-1;i++){
                sum1+=a[i-1];
                sum-=a[i];
                if(sum==sum1){
                    result=i+1;
                    tmp=1;
                    break;
                }
            }
            if(tmp==0){
                System.out.println("-1");
            }
            else{
                System.out.println(result);
            }
            t--;
        }
    }
}
