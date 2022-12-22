import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class diachiemail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<String> a= new ArrayList<>();
        while(t-- > 0){
            String s[] = sc.nextLine().trim().toLowerCase().split("\\s+");
            String s1=s[s.length-1];
            for(int i=0;i<s.length-1;i++){
                s1+=s[i].charAt(0);
            }
            a.add(s1);
            int count= Collections.frequency(a,s1);
            System.out.println(s1 + (count==1 ? "" : count) + "@ptit.edu.vn");
        }
    }
}
