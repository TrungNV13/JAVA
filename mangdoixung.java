import java.util.Scanner;

public class mangdoixung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t;
        t = input.nextInt();
        while(t>0){
            int n;
            n= input.nextInt();
            long[] a= new long[n];
            for(int i=0;i<n;i++){
                a[i] = input.nextInt();
            }
            if(check(a,n) == true){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
    public static boolean check(long[] a, int n){
        for(int i=0;i<=n/2;i++){
            if(a[i] != a[n-i-1]){
                return false;
            }
        }
        return true;
    }
}
