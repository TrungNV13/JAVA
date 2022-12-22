import java.util.Scanner;

public class sapxepdoichotructiep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        long[] a= new long[n];
        for(int i=0;i<n;i++){
            a[i]= input.nextLong();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j] && min(a,n)==false ){
                    long temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.print("Buoc " + (i+1) +": ");
            for(long x:a){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    public static  boolean min(long[] a, int n){
        for(int i=0;i<n;i++){
            if(a[i]>a[i+1]) return false;
        }
        return true;
    }
}
