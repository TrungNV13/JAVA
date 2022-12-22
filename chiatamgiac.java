import java.util.Scanner;

public class chiatamgiac {
    public static void main(String args[]) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int h = sc.nextInt();
            for (int i = 1; i < n; i++) {
                System.out.printf("%.6f ", Math.sqrt((double) i / n) * h);
            }
            System.out.println();
        }
    }
}
