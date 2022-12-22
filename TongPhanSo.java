import java.math.BigInteger;
import java.util.Scanner;

public class TongPhanSo {
    static class Fraction{
        private BigInteger tu;
        private BigInteger mau;
        public Fraction(){

        }
        public Fraction(BigInteger tu, BigInteger mau){
            this.tu = tu;
            this.mau = mau;
        }

        public void setTu(BigInteger tu) {
            this.tu = tu;
        }

        public void setMau(BigInteger mau) {
            this.mau = mau;
        }
        public void tong(Fraction a){
            BigInteger dy= mau.multiply(a.mau);
            BigInteger dx= tu.multiply(a.mau).add(a.tu.multiply(mau));
            System.out.println(dx.divide(dx.gcd(dy)) + "/" + dy.divide(dx.gcd(dy)));
        }
    }

    public static void main(String[] args) {
        Fraction a = new Fraction();
        Fraction b = new Fraction();
        Scanner sc = new Scanner(System.in);
        a.setTu(new BigInteger(sc.next()));
        a.setMau(new BigInteger(sc.next()));
        b.setTu(new BigInteger(sc.next()));
        b.setMau(new BigInteger(sc.next()));
        a.tong(b);
    }
}
