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
class DoanhNghiep{
    private String ma,ten;
    private int soSV;
    public void input(Scanner sc){
        ma=sc.nextLine();
        ten=sc.nextLine();
        soSV = Integer.parseInt(sc.nextLine());
    }

    public String getMa() {
        return ma;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+soSV;
    }
}
public class DanhSachDoanNghiep {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        int n=Integer.parseInt(sc.nextLine());
        List<DoanhNghiep> list = new ArrayList<>();
        while(n-->0){
            DoanhNghiep dn=new DoanhNghiep();
            dn.input(sc);
            list.add(dn);
        }
        list.sort(Comparator.comparing(DoanhNghiep::getMa));
        for(DoanhNghiep i:list){
            System.out.println(i);
        }
    }
}
