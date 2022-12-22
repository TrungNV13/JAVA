/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author digit
 */
public class ChuanHoaXauHoTenTrongFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(true){
            String s=sc.nextLine();
            if(s.compareTo("END") ==0){
                break;
            }
            else{
                String s1[]=s.trim().toLowerCase().split("\\s+");
                String s2="";
                for(String i:s1){
                    s2+= i.substring(0,1).toUpperCase() + i.substring(1) + " ";
                }
                System.out.println(s2.trim());
            }
            
        }
    }
}
