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
class SinhVien{
    private String ma,ten,lop,email;
    public void input(Scanner sc ){
        ma=sc.nextLine();
        ten=sc.nextLine();
        lop=sc.nextLine();
        email=sc.nextLine();
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        String s[]= ten.trim().toLowerCase().split("\\s+");
        String s1="";
        for(String i:s){
            s1+= i.substring(0,1).toUpperCase()+i.substring(1)+" ";
        }
        return s1.trim();
    }
    @Override
    public String toString(){
        return ma+" "+getTen()+" "+lop+" "+email;
    }
}
public class DanhSachSinhVienTrongFile1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in") );
        List<SinhVien> list = new ArrayList<>();
        int n=Integer.parseInt(sc.nextLine());
        while(n-- > 0 ){
            SinhVien sv = new SinhVien();
            sv.input(sc);
            list.add(sv);
        }
        list.sort(Comparator.comparing(SinhVien::getMa));
        for(SinhVien i:list){
            System.out.println(i);
        }
        sc.close();
    }
}
