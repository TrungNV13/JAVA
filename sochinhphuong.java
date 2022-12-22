import java.util.Scanner;

public class sochinhphuong {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int t;
        t= input.nextInt();
        while(t>0){
            long n;
            n= input.nextLong();
            long tmp=(long)Math.sqrt(n);
            if(tmp*tmp==n){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
            t--;
        }
    }
}
