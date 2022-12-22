/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author digit
 */
class GiaoVien{
    static int id=1;
    private String ma_gv,ten_gv,ma_xt,ketqua;
    private double diem_tin,diem_chuyen,tong,diem_uutien;
    public void input(Scanner sc){
        if(id<10){
            ma_gv="GV0";
        }
        else{
            ma_gv="GV";
        }
        ma_gv+=Integer.toString(id++);
        ten_gv=sc.nextLine();
        ma_xt=sc.nextLine();
        diem_tin=Double.parseDouble(sc.nextLine());
        diem_chuyen=Double.parseDouble(sc.nextLine());
        
    }

    public double getTong() {
        tong = diem_tin*2+diem_chuyen + getDiem_uutien();        
        return tong;
    }

    public String getMa_gv() {
        return ma_gv;
    }

    public String getKetqua() {
        if(getTong() >=18) return "TRUNG TUYEN";
        else{
            return "LOAI";
        }        
    }
    public String mon(){
        if(ma_xt.charAt(0)=='A'){
            return "TOAN";
        }
        else if(ma_xt.charAt(0)=='B'){
            return "LY";
        }
        else{
            return "HOA";
        }
    }
    
    
    public double getDiem_uutien() {
        if(ma_xt.charAt(1) == '1'){
            return 2.0;
        }
        else if(ma_xt.charAt(1) == '2') return 1.5;
        else if(ma_xt.charAt(1) == '3') return 1.0;
        else{
            return 0.0;
        }
    }
    @Override
    public String toString(){
        DecimalFormat dc = new DecimalFormat("#.0");
        return ma_gv + " " + ten_gv +  " " + mon() + " " + dc.format(getTong()) + " " + getKetqua();
    }
    
}
public class TuyenGiaoVien {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<GiaoVien> list = new ArrayList<>();
        while(n-- > 0){
            GiaoVien gv = new GiaoVien();
            gv.input(sc);
            list.add(gv);
        }
        list.sort(Comparator.comparing(GiaoVien::getTong).reversed());
        for(GiaoVien i:list){
            System.out.println(i);
        }
    }
}
//3
//Le Van Binh
//A1
//7.0
//3.0
//Tran Van Toan
//B3
//4.0
//7.0
//Hoang Thi Tam
//C2
//7.0
//6.0