import java.text.DecimalFormat;
import java.util.Scanner;

public class ChuViTamGiac {

    static class Point{
        private double x;
        private double y;
        public Point(){

        }
        public Point(double x, double y){
            this.x=x;
            this.y=y;
        }
        public Point(Point p){
            this.x=p.x;
            this.y=p.y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }
        public double distance(Point secondPoint){
            double dx = x - secondPoint.x;
            double dy = y - secondPoint.y;
            return Math.sqrt(dx*dx + dy*dy);
        }
        public double distance(Point p1, Point p2){
            double dx = p1.x - p2.x;
            double dy = p1.y - p2.y;
            return Math.sqrt(dx*dx + dy*dy);
        }
        public void in(Scanner sc){
            x = sc.nextDouble();
            y = sc.nextDouble();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){

            Point p1 = new Point();
            Point p2 = new Point();
            Point p3 = new Point();
            p1.in(sc);
            p2.in(sc);
            p3.in(sc);
            double a = p1.distance(p2);
            double b = p1.distance(p3);
            double c = p2.distance(p3);
            DecimalFormat d = new DecimalFormat("#.000");
            if(a+b>c && a+c>b && b+c>a){
                System.out.println(d.format(a+b+c));
            }
            else {
                System.out.println("INVALID");
            }
        }
    }
}
