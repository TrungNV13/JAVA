import java.util.Scanner;

public class tamgiac {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        long a,b,c;
        a= input.nextLong();
        b= input.nextLong();
        c= input.nextLong();
        if(a+b<c || a+c<b || b+c <a || a<=0 || b<=0 || c<=0 ){
            System.out.println("Fall");
        }
        else{
            double p=(a+b+c)/2;
            double result;
            result = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println(result);
            //69
        }
    }
}
