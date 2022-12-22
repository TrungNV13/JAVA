
import java.util.Scanner;
public class Khaibaolophinhchunhat {
    static class Rectange{
        private double width;
        private double height;
        private String color;
        public Rectange(){
          height = 1;
          width = 1;
        }
        public Rectange(double width, double height , String color){
            this.color=color;
            this.height=height;
            this.width=width;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
        public double findArea(){
            return width*height;
        }
        public double findPerimeter(){
            return (width+height)*2;
        }
        public String convertColor(){
            return String.valueOf(color.substring(0,1).toUpperCase()+color.substring(1).toLowerCase());
        }
        public void in(){
            Scanner sc = new Scanner(System.in);
            width = sc.nextDouble();
            height = sc.nextDouble();
            color = sc.next();
        }
        @Override
        public String toString(){
            if(width > 0 && height >0 && Math.ceil(width)== Math.floor(width) && Math.ceil(height)== Math.floor(height) ){
                return (int)findPerimeter() + " " +  (int)findArea()+" " + convertColor();

            }
            else {
                return "INVALID";
            }
         }
    }

    public static void main(String[] args) {
        Rectange hcn = new Rectange();
        hcn.in();
        System.out.println(hcn);
    }
}
