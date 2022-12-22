/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author digit
 */
public class LietKeTheoThuTuXuatHien {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        List<String> list = (ArrayList<String>) obj.readObject();
        Set<String> set1= new TreeSet<>();
        for(String s:list){
            String s1[]=s.trim().toLowerCase().split("\\s+");
            set1.addAll(Arrays.asList(s1));
        }
        Scanner sc = new Scanner(new File("VANBAN.in"));
        while(sc.hasNext()){
            String s=sc.next().toLowerCase();
            if(set1.contains(s)){
                System.out.println(s);
                set1.remove(s);
            }
            
        }
    }
}
