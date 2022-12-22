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
    private String maKH,ten,maP;
    private Date ngayDen,ngayDi;
    private long soNgay;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public void input(Scanner sc) throws ParseException{
        maKH="KH"+String.format("%02d", id++);
        ten=sc.nextLine();
        maP=sc.nextLine();
        ngayDen=sdf.parse(sc.nextLine());
        ngayDi=sdf.parse(sc.nextLine());
    }

    public long getSoNgay() {
        soNgay=(ngayDi.getTime()-ngayDen.getTime())/1000/60/60/24;
        return soNgay;
    }
    @Override
    public String toString(){
        return maKH+" "+ten+" "+maP+" "+getSoNgay();
    }
}
public class DanhSachLuuTru {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("src/code/KHACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<KhachHang> list = new ArrayList<>();
        while(n-->0){
            KhachHang kh=new KhachHang();
            kh.input(sc);
            list.add(kh);
        }
        list.sort(Comparator.comparing(KhachHang::getSoNgay).reversed());
        for(KhachHang i:list){
            System.out.println(i);
        }
    }
}
