
import java.util.Scanner;

public class tonguocso1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max= 2000001;
        int[] isNotPrime = new int[max];
        for(int i=2; i*i <max ; i++){
            if(isNotPrime[i]==0){
                for( int j= i*i ; j <max ; j+=i){
                    isNotPrime[j] = 1;
                }
            }
        }
        int[] sum = new int[max];
        for(int i=2;i< max; i++){
            if(isNotPrime[i]==0){
                for(int j=i;j<max;j+=i){
                    int tmp=j;
                    while(tmp%i==0){
                        sum[j]+=i;
                        tmp/=i;
                    }
                }
            }
        }
        int t = sc.nextInt();
        long result = 0;
        while (t > 0) {
            result += sum[sc.nextInt()];
            t--;
        }
        System.out.println(result);
    }
}
