import java.util.Scanner;

public class uocsochiahetcho2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t;
        t= input.nextInt();
        while(t>0){
            long n,cout=0;
            n = input.nextLong();
            for(long i=1;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    if(i%2==0){
                        cout++;
                    }
                    if ( (n/i)!=i && (n/i) % 2 ==0) {
                        cout++;
                    }
                }
            }
            System.out.println(cout);
            t--;
        }
    }
}
