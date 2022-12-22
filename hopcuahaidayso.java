import java.util.Scanner;
import java.util.TreeSet;

public class hopcuahaidayso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,m;
        n = input.nextInt();
        m = input.nextInt();
        TreeSet<Integer> A= new TreeSet<>();
        for(int i=0;i<n+m;i++){
            A.add(input.nextInt());
        }
        for(int i:A){
            System.out.print(i+ " ");
        }

    }
}
