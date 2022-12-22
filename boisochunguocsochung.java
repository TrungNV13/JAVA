import java.util.Scanner;

public class boisochunguocsochung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t;
        t = input.nextInt();
        while(t>0){
            long a,b;
            a=input.nextLong();
            b=input.nextLong();
            t--;
            System.out.println(a*b/uoc_max(a,b) +" "+ uoc_max(a,b) );
        }
    }
    public static long uoc_max(long a, long b){
        if(a<b){
            long temp=a;
            a=b;
            b=temp;
        }
        long r=1;
        while(r!=0){
            r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
}
