import java.math.BigInteger;
import java.util.Scanner;

public class hieuhaisonguyenlon1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        while(t-- > 0 ){
            String a = sc.next();
            String b = sc.next();
            int temp = Math.max(a.length(),b.length());
            BigInteger big1 = new BigInteger(a);
            BigInteger big2 = new BigInteger(b);
            String result= big1.subtract(big2).abs().toString();
            while(result.length() < temp){
                result = "0" + result;
            }
            System.out.println(result);
        }
    }
}
