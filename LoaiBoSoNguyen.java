/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author digit
 */
public class LoaiBoSoNguyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        List<String> list = new ArrayList<>();
        while(sc.hasNext()){
            String s = sc.next();
            try{
                Integer.parseInt(s);
            }
            catch(Exception e){
                list.add(s);
            }
        }
        Collections.sort(list);
            for(String i:list){
                System.out.print(i+ " ");
            }
    }
    
}
