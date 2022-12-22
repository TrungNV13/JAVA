import java.util.Scanner;

public class demsolanxuathien {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int t;
        t = input.nextInt();
        int t1=1;
        while(t>0){
            int n,cout=0;
            n= input.nextInt();
            long[] a= new long[n];
            long[] b= new long[n];
            for(int i=0;i<n;i++){
                a[i] = input.nextInt();
                b[i] = 1;
            }
            System.out.println("Test " + t1 + ":");
            for(int i=0;i<n;i++){
                if(b[i]==1){
                    b[i]=0;
                    cout++;
                    for(int j=i+1;j<n;j++){
                        if(a[i]==a[j]){
                            b[j]=0;
                            cout++;
                        }
                    }
                    System.out.println(a[i] + " xuat hien " + cout + " lan");
                    cout=0;
                }
            }
            t--;t1++;
        }
    }
}
