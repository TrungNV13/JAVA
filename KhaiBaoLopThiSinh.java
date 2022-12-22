import java.text.DecimalFormat;
import java.util.Scanner;

public class KhaiBaoLopThiSinh {
    static class ThiSinh{
        private String name;
        private String birthday;
        private double point1;
        private double point2;
        private double point3;
        public void  in(){
            Scanner sc = new Scanner(System.in);
            name = sc.nextLine();
            birthday =sc.nextLine();
            point1 = Double.parseDouble(sc.nextLine());
            point2 = Double.parseDouble(sc.nextLine());
            point3 = Double.parseDouble(sc.nextLine());
        }
        DecimalFormat a = new DecimalFormat("#.0");
        public String sum(){
            return a.format(point1+ point2 + point3);
        }
        @Override
        public String toString(){
            return name + " " + birthday+ " "+ sum();
        }
    }

    public static void main(String[] args) {
        ThiSinh a = new ThiSinh();
        a.in();
        System.out.println(a);
    }
}
