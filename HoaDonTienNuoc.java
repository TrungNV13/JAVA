/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author digit
 */
class KhachHang{
    static int id=1;
    private String ma,name;
    private long cu,moi;
    public void input(Scanner sc){
        if(id<10){
            ma="KH0";
        }
        else{
            ma="KH";
        }
        ma+=Integer.toString(id++);
        name=sc.nextLine();
        cu=Integer.parseInt(sc.nextLine());
        moi=Integer.parseInt(sc.nextLine());
    }

    public int sum() {
        float sum=0;
        long hientai=moi-cu;
        if(hientai<=50){
            sum= ((hientai)*100*(1+ (float)2/100));
        }
        else if(hientai<=100){
            sum= ((50*100 + (hientai-50)*150)*(1+(float)3/100));
        }
        else{
            sum= ((50*100 + 50*150 + (hientai-100)*200)*(1+(float)5/100));
        }
        return Math.round(sum);
    }
    @Override
    public String toString(){
        return ma+" " + name + " " +   sum();
    }
    
}
public class HoaDonTienNuoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<KhachHang> list = new ArrayList<>();
        while(n-- >0){
            KhachHang kh = new KhachHang();
            kh.input(sc);
            list.add(kh);
        }
        list.sort(Comparator.comparing(KhachHang::sum).reversed());
        for(KhachHang i:list){
            System.out.println(i);
        }
    }
}
