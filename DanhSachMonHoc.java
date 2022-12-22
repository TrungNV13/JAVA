/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author digit
 */
class MonHoc{
    private String ma,ten;
    private int tin;
    public void input(Scanner sc ){
        ma=sc.nextLine();
        ten=sc.nextLine();
        tin=Integer.parseInt(sc.nextLine());
    }

    public String getTen() {
        return ten;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+tin;
    }
}
public class DanhSachMonHoc {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        List<MonHoc> list = new ArrayList<>();
        int n =Integer.parseInt(sc.nextLine());
        while(n-->0){
            MonHoc mh=new MonHoc();
            mh.input(sc);
            list.add(mh);
        }
        list.sort(Comparator.comparing(MonHoc::getTen));
        for(MonHoc i:list){
            System.out.println(i);
        }
    }
    
}
