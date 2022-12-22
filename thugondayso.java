import java.util.ArrayList;
import java.util.Scanner;

public class thugondayso {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n;
       n = sc.nextInt();
       ArrayList<Integer>  a = new ArrayList<>(n);
       for(int i=0;i<n;i++){
           a.add(sc.nextInt());
       }
       while(true){
           boolean check = false;
           for(int i=1;i<a.size();i++){
               if((a.get(i) + a.get(i-1)) %2==0){
                   check = true;
                   a.remove(i);
                   a.remove((i-1));
                   i--;
               }
           }
           if(check == false){
               break;
           }
       }
        System.out.println(a.size());
    }
}
