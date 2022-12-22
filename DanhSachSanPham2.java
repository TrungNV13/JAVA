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
class DanhSach{
    private String maSP,tenSP;
    private int giaBan,baoHanh;
    public void input(Scanner sc ){
        maSP=sc.nextLine();
        tenSP=sc.nextLine();
        giaBan=Integer.parseInt(sc.nextLine());
        baoHanh=Integer.parseInt(sc.nextLine());
    }

    public String getMaSP() {
        return maSP;
    }

    public int getGiaBan() {
        return giaBan;
    }
    @Override
    public String toString(){
        return maSP+" "+tenSP+" "+giaBan+" "+baoHanh;
    }
}
public class DanhSachSanPham2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<DanhSach> list = new ArrayList<>();
        while(n-- >0){
            DanhSach ds=new DanhSach();
            ds.input(sc);
            list.add(ds);
        }
        list.sort(Comparator.comparing(DanhSach::getGiaBan).reversed().thenComparing(DanhSach::getMaSP));
        list.forEach((i) -> System.out.println(i));
    }
}
