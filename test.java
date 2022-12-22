/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

/**
 *
 * @author digit
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class test {
    private String ma, ten, xeploai;
    private Date ngsinh;
    private float lythuyet, thuchanh;
    private int tuoi, diemtb;

    public test(int stt, String ten, Date ngsinh, float lythuyet, float thuchanh) {
        this.ma = String.format("PH%02d",stt);
        this.ten = ten;
        this.ngsinh = ngsinh;
        this.lythuyet = lythuyet;
        this.thuchanh = thuchanh;
    }
    public String chuanhoa(){
        ten = ten.trim().toLowerCase();
        String s[] = ten.split("\\s+");
        String s1 = "";
        for(String i:s){
            s1 += i.substring(0,1 ).toUpperCase() + i.substring(1) + " ";
        }
        return s1.trim();
    }
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("src/code/XETTUYEN.in"));
        List<test> l = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        while(sc.hasNextLine()){
            for(int i=1;i<=t;i++){
                String ten = sc.nextLine();
                Date ngsinh = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());
                float lythuyet = Float.parseFloat(sc.nextLine());
                float thuchanh = Float.parseFloat(sc.nextLine());
                l.add(new test(i, ten, ngsinh, lythuyet, thuchanh));
            }
            for(int i=1;i<=t;i++){
                Calendar c = Calendar.getInstance();
                int hientai = c.get(Calendar.YEAR);
                l.get(i).tuoi=hientai-Integer.parseInt(new SimpleDateFormat("dd/MM/yyyy").format(l.get(i).ngsinh).substring(6))-1;
                
                float diemthuong = 0;
                if(l.get(i).lythuyet >=8 && l.get(i).thuchanh >=8)
                    diemthuong = 1;
                if(l.get(i).lythuyet >=7.5 && l.get(i).thuchanh >=7.5)
                    diemthuong = 0.5F;
                l.get(i).diemtb = Math.round((l.get(i).lythuyet + l.get(i).thuchanh)/2 + diemthuong);
                if(l.get(i).diemtb > 10)
                    l.get(i).diemtb = 10;
                if(l.get(i).diemtb < 5)
                    l.get(i).xeploai = "Truot";
                if(l.get(i).diemtb <= 6)
                    l.get(i).xeploai = "Trung binh";
                if(l.get(i).diemtb == 7)
                    l.get(i).xeploai = "Kha";
                if(l.get(i).diemtb == 8 )
                    l.get(i).xeploai = "Gioi";
                if(l.get(i).diemtb == 9 || l.get(i).diemtb == 10)
                    l.get(i).xeploai = "Xuat sac";
            }
        }
        for(test i:l){
            System.out.println(i.ma + " " + i.chuanhoa() + " " + i.tuoi + " " + i.diemtb + " " + i.xeploai);
        }
    }
}
