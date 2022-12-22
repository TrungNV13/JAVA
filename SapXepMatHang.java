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
class MatHang{
    static int id=1;
    private String maMH,tenMH,nhomMH;
    private double giaMua,giaBan,loiNhuan;
    public void input(Scanner sc ){
        maMH="MH"+String.format("%02d", id++);
        tenMH=sc.nextLine();
        nhomMH=sc.nextLine();
        giaMua=Double.parseDouble(sc.nextLine());
        giaBan=Double.parseDouble(sc.nextLine());
    }

    public double getLoiNhuan() {
        DecimalFormat dcf = new DecimalFormat("#.00");
        loiNhuan = giaBan - giaMua;
        return Double.parseDouble(dcf.format(loiNhuan));
    }
    public String inLoiNhuan(){
        DecimalFormat dcf = new DecimalFormat("#.00");
//        loiNhuan = giaBan - giaMua;
        return dcf.format(loiNhuan);
    }
    @Override
    public String toString(){
        return maMH+" "+tenMH+" "+nhomMH+" "+inLoiNhuan();
    }
}
public class SapXepMatHang {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/code/MATHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<MatHang> list = new ArrayList<>();
        while(n-- >0){
            MatHang mh = new MatHang();
            mh.input(sc);
            list.add(mh);
        }
        list.sort(Comparator.comparing(MatHang::getLoiNhuan).reversed());
        list.forEach((i) -> System.out.println(i));
    }
}
