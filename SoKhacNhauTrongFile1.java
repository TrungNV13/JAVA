/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author digit
 */
public class SoKhacNhauTrongFile1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        Map<Integer,Integer> a = new HashMap<>();
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            if(a.containsKey(n) == true){
                a.put(n, a.get(n) + 1);
            }
            else{
                a.put(n, 1);
            }           
        }
        Set<Integer> set = a.keySet();
            for(Integer key:set){
                System.out.println(key+" "+a.get(key));
            }
        sc.close();
    }
}
