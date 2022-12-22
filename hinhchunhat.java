import java.util.Scanner;

public class hinhchunhat {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n,m;
        n=input.nextInt();
        m= input.nextInt();
        if(n <= 0 || m <=0){
            System.out.println("0");
        }
        else{
            System.out.println(2*n+2*m + " " +  n*m);

        }
    }
}
