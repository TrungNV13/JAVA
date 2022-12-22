import java.util.HashSet;
import java.util.Scanner;

public class tapturiengcuahaixau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        int t1 = Integer.parseInt(t);
        while(t1-- > 0){
            String s1[] = sc.nextLine().split("\\s");
            String s2 = sc.nextLine();
            HashSet<String> s3 = new HashSet<>();
            for(String i:s1){
                if(s2.contains(i)==false){
                    s3.add(i);
                }
            }
            for(String i:s3){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
