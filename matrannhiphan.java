import java.util.Scanner;

public class matrannhiphan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][]= new int[n][3];
        int result = 0;
        for(int i=0;i<n;i++){
            int cout=0;
            for(int j=0;j<3;j++){
                a[i][j]= sc.nextInt();
                if(a[i][j]==1){
                    cout++;
                }
            }
            if(cout > 1){
                result++;
            }
        }
        System.out.println(result);
    }
}
