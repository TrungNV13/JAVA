/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author digit
 */
class ThiSinh{
    static int id=1;
    private String ma,tenTS,ngaySinh,xepLoai;
    private double diemLyThuyet,diemThucHanh,diemThuong;
    private long diemTB;
    
    public void input(Scanner sc){
        ma="PH" + String.format("%02d", id++);
        tenTS = sc.nextLine();
        ngaySinh=sc.nextLine();
        diemLyThuyet=Double.parseDouble(sc.nextLine());
        diemThucHanh = Double.parseDouble(sc.nextLine());
    }

    public String getTenTS() {
        String s[] = tenTS.trim().toLowerCase().split("\\s+");
        String s1="";
        for(String i:s){
            s1+=i.substring(0, 1).toUpperCase()+i.substring(1)+" ";
        }
        return s1.trim();
    }

    public double getDiemThuong() {
        if(diemLyThuyet>=8 && diemThucHanh>=8) diemThuong=1.0;
        else if(diemLyThuyet>=7.5 && diemThucHanh>=7.5 ) diemThuong=0.5;
        else diemThuong=0.0;
        return diemThuong;
    }

    public int getNgaySinh() {
        int date = Integer.parseInt(ngaySinh.split("/")[2]);
        
        Calendar c=Calendar.getInstance();
        int nam_hien_tai=c.get(Calendar.YEAR);
        return nam_hien_tai-date;
    }

    public long getDiemTB() {
        diemTB= Math.round((diemThucHanh+diemLyThuyet)/2 + getDiemThuong());
        if(diemTB >10) return 10;
        else return diemTB;
    }

    public String getXepLoai() {
        if(getDiemTB()<5) xepLoai= "Truot";
        else if(getDiemTB()<=6) xepLoai= "Trung binh";
        else if(getDiemTB()==7) xepLoai= "Kha";
        else if(getDiemTB() == 8 ) xepLoai= "Gioi";
        else if (getDiemTB() == 9 || getDiemTB() == 10) xepLoai= "Xuat sac";
        return xepLoai;
    }
    
    @Override
    public String toString(){
        return ma+" "+getTenTS()+" "+getNgaySinh()+" "+ getDiemTB()+" "+getXepLoai();
    }
}
public class XetTuyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        List<ThiSinh> list = new ArrayList<>();
        int n =Integer.parseInt(sc.nextLine());
        while(n-- >0){
            ThiSinh ts = new ThiSinh();
            ts.input(sc);
            list.add(ts);
        }
        list.forEach((i) -> System.out.println(i));
    }
}
