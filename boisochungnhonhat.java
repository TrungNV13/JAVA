import java.math.BigInteger;
import java.util.Scanner;

public class boisochungnhonhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0){
            BigInteger A = sc.nextBigInteger();
            BigInteger B = sc.nextBigInteger();
            System.out.println(A.multiply(B).divide(A.gcd(B)));
        }
    }
}
