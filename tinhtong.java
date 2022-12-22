import java.util.Scanner;

public class tinhtong {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        long t,n;
        t= input.nextLong();
        while(t>0){
            n= input.nextLong();
            System.out.println(n*(n+1)/2);
            t--;
        }
    }
}
