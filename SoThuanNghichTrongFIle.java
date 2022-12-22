/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author digit
 */
public class SoThuanNghichTrongFIle {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> list1=(ArrayList<Integer>) obj.readObject();
        int a[] = new int[1000001];
        int b[] = new int[1000001];
        for(Integer i:list1){
            if(check(i.toString())){
                a[i]++;
            }
        }
        obj = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> list2=(ArrayList<Integer>) obj.readObject();
        for(Integer i:list2){
            if(check(i.toString())){
                b[i]++;
            }
        }
        int cout=0;
        for(int i=0;i<=1000000;i++){
            if(a[i]>0 && b[i]>0){
                System.out.println(i+" "+(a[i]+b[i]));
                cout++;
            }
            if(cout==10) break;
        }
    }
    public static boolean check(String s){
        if(s.length()%2==0 || s.length()==1){
            return false;
        }
        for(int i=0;i<=s.length()/2;i++){
            if(Character.valueOf(s.charAt(i))%2==0 ){
                return false;
            }
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    
}
