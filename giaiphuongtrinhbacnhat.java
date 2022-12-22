import java.util.Scanner;

public class giaiphuongtrinhbacnhat {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double a,b;
        a= input.nextDouble();
        b= input.nextDouble();
        if (a==0 && b!=0){
            System.out.println("VN");
        } else if (a==0 && b==0) {
            System.out.println("VSN");
        }
        else {
            System.out.printf("%.2f",-b/a);
        }
    }
}
