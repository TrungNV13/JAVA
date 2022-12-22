import java.io.File;
import java.util.Scanner;

public class HelloFIle {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("Hello.txt"));
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
