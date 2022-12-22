import java.util.Scanner;

public class tonggiaithua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        long sum=0,temp=1;
        for(int i=1;i<=n;i++){
            temp= temp*i;
            sum+=temp;
        }
        System.out.println(sum);
    }
}
