import java.util.Scanner;

public class lietketohop2 {
    public static void main(String[] args) {
        int N,K;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        int a[] = new int[K];
        for(int i=0;i<K;i++){
            a[i] = i + 1;
        }
        int cout=0;
        while(true){
            output(a);
            cout++;
            int i=K -1;
            while(i>=0 && a[i] >= N-K + i +1){
                i--;
            }
            if(i==-1) break;
            a[i]=a[i]+1;
            for(int j=i+1;j<K;j++){
                a[j] = a[i] +j -i;
            }
        }
        System.out.println();
        System.out.println("Tong cong co " + cout + " to hop");
    }
    public static void output(int a[]){
        for(int i:a){
            System.out.print(i);
        }
        System.out.print(" ");
    }
}
