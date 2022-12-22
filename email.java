
package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class email {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/code/DANHSACH.in"));
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        while(sc.hasNextLine()){
            String x=sc.nextLine();
            String s[]=x.trim().toLowerCase().split("\\s+");
            String s2[]=x.trim().toLowerCase().split("\\s+");
            String tmp="";
            for(String i:s2){
                tmp+=i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
                b.add(tmp.trim());
            }
            if(Collections.frequency(b,tmp.trim())!=1) continue;
            String  s1=s[s.length-1];
            for(int i=0;i<s.length-1;i++){
                s1+=s[i].charAt(0);
            }
            a.add(s1);
            
            int count= Collections.frequency(a,s1);
            System.out.println(s1 + (count==1 ? "" : count) + "@ptit.edu.vn");
        }
        sc.close();
    }
}
