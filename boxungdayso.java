import java.util.Scanner;

public class boxungdayso {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] =  new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int j=0,temp=a[n-1];
        boolean check =false;
        for(int i=1;i<=temp;i++){
            if(i==a[j]){
                j++;
            }
            else{
                check=true;
                System.out.println(i);
            }
        }
        if ((check==false)){
            System.out.println("Excellent!");
        }
    }
}
