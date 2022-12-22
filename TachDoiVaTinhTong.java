/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author digit
 */
public class TachDoiVaTinhTong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/code/DATA.in"));
        BigInteger n = sc.nextBigInteger();
        while(true){
            String s = n.toString();
            if(s.length() == 1 ){
                break;
            }
            String s1 = s.substring(0,s.length()/2);
            String s2 = s.substring(s.length()/2);
            BigInteger a = new BigInteger(s1);
            BigInteger b = new BigInteger(s2);
            n = a.add(b);
            System.out.println(n);
        }
        sc.close();
    }
    
}
