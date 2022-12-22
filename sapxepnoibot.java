import java.util.Scanner;

public class sapxepnoibot {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        int n;
        n = input.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++){
            a[i] = input.nextInt();
        }
        int t=1;
        while(true){
            boolean check=false;
            for(int i=0;i<n-1;i++){
                if(a[i] > a[i+1]) {
                    int temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                    check=true;
                }
            }
            if(check==false){
                break;
            }
            else {
                System.out.print("Buoc " + t + ": " );
                for (int x:a){
                    System.out.print(x+ " ");
                }
            }
            System.out.println();
            t++;
        }
    }
}
