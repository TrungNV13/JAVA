/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author digit
 */
class SinhVien{
    static int id=1;
    private String ma,ten;
    private int dLuyenTap,DThucHanh,DThi;
    private float tongDiem;
    private String xepLoai;
    
    public void input(Scanner sc){
        ma="SV" +  String.format("%02d", id++);
        ten = sc.nextLine();
        dLuyenTap = Integer.parseInt(sc.nextLine());
        DThucHanh = Integer.parseInt(sc.nextLine());
        DThi = Integer.parseInt(sc.nextLine());
        tongDiem =  (float) ((float) dLuyenTap*0.25 + DThucHanh*0.35 + DThi*0.4);
    }

    public String getTen() {
        String s[]=ten.trim().toLowerCase().split("\\s+");
        String s1="";
        for(String x:s){
            s1+=x.substring(0, 1).toUpperCase()+x.substring(1)+" ";
        }
        return s1.trim();
    }
    
    public String getXepLoai(){
        if(tongDiem >=8) xepLoai="GIOI";
        else if(tongDiem >=6.5) xepLoai="KHA";
        else if(tongDiem >=5) xepLoai = "TRUNG BINH";
        else{
            xepLoai= "KEM";
        }
        return xepLoai;
        
    }

    public float getTongDiem() {
        return tongDiem;
    }
    public String inTongDiem(){
        DecimalFormat dcf = new DecimalFormat("#.00");
        return dcf.format(tongDiem);
    }
    @Override
    public String toString(){
        return ma+" "+getTen()+" "+inTongDiem()+" "+getXepLoai();
    }
}
public class XepLoai {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        List<SinhVien> list =new ArrayList<>();
        int n =Integer.parseInt(sc.nextLine());
        while(n-- >0){
            SinhVien sv =new SinhVien();
            sv.input(sc);
            list.add(sv);
        }
        list.sort(Comparator.comparing(SinhVien::getTongDiem).reversed());
        for(SinhVien i:list){
            System.out.println(i);
        }
    }
}
