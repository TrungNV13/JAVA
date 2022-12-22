import java.util.Scanner;

public class songuyento {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int t;
        t= input.nextInt();
        while(t>0){
            long n;
            n= input.nextLong();
            System.out.println(prime(n));
            t--;
        }
    }
    public static String prime(long n){
        for(long i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return "NO";
        }
        return "YES";
    }
}
