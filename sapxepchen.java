import java.util.Scanner;

public class sapxepchen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++){
            a[i]= input.nextInt();
        }
        int key=0,j=0;
        for(int i=0;i<n;i++){
            System.out.printf("Buoc %d: ",i);
            key = a[i];
            j=i-1;
            while( j>=0 && a[j] > key){
                a[j+1] = a[j];
                j-=1;
            }
            a[j+1] = key;
            for(int k=0;k<=i;k++){
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }
    }
}
