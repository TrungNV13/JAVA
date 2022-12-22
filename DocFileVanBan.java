import java.io.File;
import java.util.Scanner;

public class DocFileVanBan {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
