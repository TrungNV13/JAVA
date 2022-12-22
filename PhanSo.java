import java.math.BigInteger;
import java.util.Scanner;

public class PhanSo {
    static class Fraction{
        private BigInteger tu;
        private BigInteger mau;
        public Fraction(){

        }
        public Fraction(BigInteger tu, BigInteger mau){
            this.tu=tu;
            this.mau=mau;
        }
        public void in(){
            Scanner sc = new Scanner(System.in);
            tu = sc.nextBigInteger();
            mau = sc.nextBigInteger();
        }
        @Override
        public String toString(){
            return tu.divide(tu.gcd(mau)) + "/" + mau.divide(tu.gcd(mau));
        }
    }

    public static void main(String[] args) {
        Fraction a = new Fraction();
        a.in();
        System.out.println(a);

    }
}
