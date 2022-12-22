/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author digit
 */
class KhachHang{
    static int id=1;
    private String maKH,tenKH,soP;
    private Date ngayNhanP,ngayTraP;
    private int tienDV;
    private long thanhTien;
    public void input(Scanner sc ) throws ParseException{
        maKH = "KH"+String.format("%02d", id++);
        tenKH = sc.nextLine();
        soP = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        ngayNhanP = sdf.parse(sc.nextLine());
        ngayTraP = sdf.parse(sc.nextLine());
        tienDV = Integer.parseInt(sc.nextLine());
    }
    public int gia(){
        if(soP.charAt(0)=='1') return 25;
        else if(soP.charAt(0)=='2') return 34;
        else if(soP.charAt(0)=='3') return 50;
        else return 80;
    }
    public long ngayO(){
        long ngay = (ngayTraP.getTime()-ngayNhanP.getTime())/1000/60/60/24;
        return (ngay+1);
    }

    public long getThanhTien() {
        thanhTien=ngayO()*gia()+tienDV;
        return thanhTien;
    }

    public String getTenKH() {
        String s[]=tenKH.trim().toLowerCase().split("\\s+");
        String s1="";
        for(String i:s){
            s1+=i.substring(0,1).toUpperCase()+i.substring(1)+" ";
        }
        return s1.trim();
    }

    public String getSoP() {
        return soP.trim();
    }
    
    @Override
    public String toString(){
        return maKH+" "+getTenKH()+" "+getSoP()+" "+ngayO()+" "+getThanhTien();
    }
}
public class TinhTienPhong {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        List<KhachHang> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            KhachHang kh = new KhachHang();
            kh.input(sc);
            list.add(kh);
            
        }
        list.sort(Comparator.comparing(KhachHang::getThanhTien).reversed());
        list.forEach((i) -> System.out.println(i));
    }
}
