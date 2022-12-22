

import java.util.Scanner;
import java.util.TreeSet;

public class giaocuahaidayso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,m;
        n = input.nextInt();
        m = input.nextInt();
        TreeSet<Integer> A= new TreeSet<>();
        TreeSet<Integer> B= new TreeSet<>();
        for(int i=0;i<n;i++){
            A.add(input.nextInt());
        }
        for (int i=0 ; i<m ;i++){
            B.add(input.nextInt());
        }
        A.retainAll(B);
        for(int i:A){
            System.out.print(i+ " ");
        }

    }
}
