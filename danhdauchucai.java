
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class danhdauchucai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<Character> a = new LinkedHashSet<>();
        for(int i=0;i<s.length();i++){
            a.add(s.charAt(i));
        }
        System.out.println(a.size());
    }
}
