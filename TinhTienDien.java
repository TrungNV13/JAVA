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
public class TinhTienDien {
    static int id=1;
    private String ma,ten,loai,value;
    private long soDau,soCuoi,dinhMuc,soDien,tienTrongDInhMuc,tienVuotDinhMuc,VAT;
    
    
    public void input(Scanner sc){
        ma="KH" + String.format("%02d", id++);
        ten = sc.nextLine();
        value = sc.nextLine();
        loai = value.trim().split("\\s+")[0];
        soDau = Integer.parseInt(value.trim().split("\\s+")[1]);
        soCuoi = Integer.parseInt(value.trim().split("\\s+")[2]);
  
        soDien =  soCuoi-soDau;
    }

    public long getDinhMuc() {
        if(loai.compareTo("A")==0){
            dinhMuc= 100;
        }
        else if(loai.compareTo("B")==0){
            dinhMuc= 500;
        }
        else{
            dinhMuc=200;
        }
        return dinhMuc;
    }

    public long getTienTrongDInhMuc() {
        if(soDien < getDinhMuc()) tienTrongDInhMuc=soDien*450;
        else {
            tienTrongDInhMuc = getDinhMuc()*450;
        }
        return tienTrongDInhMuc;
    }

    public long getTienVuotDinhMuc() {
        if(soDien > getDinhMuc()) tienVuotDinhMuc = (soDien-getDinhMuc())*1000;
        else{
            tienVuotDinhMuc=0;
        }
        return tienVuotDinhMuc;
    }

    public long getVAT() {
        return (long)(0.05*getTienVuotDinhMuc());
    }

    public String getTen() {
        String s[]=ten.trim().toLowerCase().split("\\s+");
        String s1="";
        for(String x:s){
            s1+=x.substring(0,1).toUpperCase()+x.substring(1)+" ";
        }
        return s1.trim();
    }
    
    public long getTong(){
        return getTienTrongDInhMuc()+getTienVuotDinhMuc()+getVAT();
    }
    @Override
    public String toString(){
        return ma+" "+ getTen()+" " + getTienTrongDInhMuc() + " " + getTienVuotDinhMuc() + " " + getVAT() + " " + getTong() ;
        
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        List<TinhTienDien> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            TinhTienDien td= new TinhTienDien();
            td.input(sc);
            list.add(td);
        }
        list.sort(Comparator.comparing(TinhTienDien::getTong).reversed());
        for(TinhTienDien i:list){
            System.out.println(i);
        }
    }
}
