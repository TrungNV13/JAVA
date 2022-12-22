import java.util.Scanner;

public class sapxepchon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        long[] a= new long[n];
        for(int i=0;i<n;i++){
            a[i]= input.nextLong();
        }
        for(int i=0;i<n-1;i++){
            int min_index = i;
            for(int j=i+1;j<n;j++){
                if(a[min_index]>a[j] && min(a,n)==false ){
                    min_index=j;
                }
            }
            long temp=a[min_index];
            a[min_index] = a[i];
            a[i]=temp;
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
