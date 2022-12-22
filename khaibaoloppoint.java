import java.text.DecimalFormat;
import java.util.Scanner;

public class khaibaoloppoint {
    static class Point{
        private double x;
        private double y;
        public Point(){

        }
        public Point(double x,double y){
            this.x=x;
            this.y=y;
        }
        public Point(Point p){
            this.x = p.x;
            this.y = p.y;
        }
        public double getX() {
            return x;
        }
        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }

        public double distance(Point secondPoint){
            double dx = Math.abs(this.x - secondPoint.x);
            double dy = Math.abs(this.y - secondPoint.y);
            double result = Math.sqrt((dx*dx) + (dy*dy));
            return result;
        }
        public double distance(Point p1, Point p2){
            double dx= Math.abs(p1.x - p2.x);
            double dy= Math.abs(p1.y - p2.y);
            double result = Math.sqrt((dx*dx) + (dy * dy));
            return result;
        }
        @Override
        public String toString(){
            return super.toString();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
           Point p1 = new Point();
           Point p2 = new Point();
           p1.setX(sc.nextDouble());
           p1.setY(sc.nextDouble());
           p2.setX(sc.nextDouble());
           p2.setY(sc.nextDouble());
           DecimalFormat a = new DecimalFormat("#.0000");
           System.out.println(a.format(p1.distance(p2)));
        }
    }
}
