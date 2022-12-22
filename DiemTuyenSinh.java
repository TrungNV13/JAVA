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
class ThiSinh{
    static int id=1;
    private String ma,ten;
    private float diemThi,tongDiem,diemUT;
    private String danToc,trangThai;
    private int khuVuc;
    
    public void input(Scanner sc){
        ma="TS" + String.format("%02d", id++);
        ten = sc.nextLine();
        diemThi = Float.parseFloat(sc.nextLine());
        danToc =sc.nextLine();
        khuVuc  = Integer.parseInt(sc.nextLine());             
    }

    public String getTen() {
        String s[]=ten.trim().toLowerCase().split("\\s+");
        String s1="";
        for(String x:s){
            s1+=x.substring(0, 1).toUpperCase()+x.substring(1)+" ";
        }
        return s1.trim();
    }

    public float getDiemUT() {
        if(khuVuc==1) {
            diemUT=(float) 1.5;
        }
        else if(khuVuc==2){
             diemUT = 1;
        }
        else {
             diemUT = 0;
        }
        if(danToc.compareTo("Kinh")==0) {
            diemUT+=0;
        }
        else{
            diemUT+=1.5;
        }
        return diemUT;
    }

    public float getTongDiem() {
        tongDiem =diemThi+getDiemUT();
        return tongDiem;
    }
    
    public String inTongDiem(){
        DecimalFormat dcf = new DecimalFormat("#.0");
        return dcf.format(getTongDiem());
    }

    public String getTrangThai() {
        if(getTongDiem()>=20.5) trangThai="Do";
        else trangThai="Truot";
        return trangThai;
    }

    public String getMa() {
        return ma;
    }
    
    @Override
    public String toString(){
        return ma+" "+getTen()+" "+inTongDiem()+ " "+ getTrangThai();
    }
    
}
public class DiemTuyenSinh {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        List<ThiSinh> list = new ArrayList<>();
        int n= Integer.parseInt(sc.nextLine());
        while(n-- >0){
            ThiSinh ts= new ThiSinh();
            ts.input(sc);
            list.add(ts);
        }
        list.sort(Comparator.comparing(ThiSinh::getTongDiem).reversed().thenComparing(ThiSinh::getMa));
        for(ThiSinh i:list){
            System.out.println(i);
        }
    }
}
