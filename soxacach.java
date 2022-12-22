import java.util.Scanner;

public class soxacach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int  a[] = new int[n];
            for(int i=0;i<n;i++){
                a[i]=i+1;
            }

            while(true){
                int i= n-1;
                while(i>=0 && a[i] >= a[i+1]){
                    i--;
                }

            }
        }
    }
    public static void output(int a[]){
        for(int i:a){
            System.out.print(i);
        }
        System.out.println();
    }
}
