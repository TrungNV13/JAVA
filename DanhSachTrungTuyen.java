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
class ThiSinh{
    private String maTS,tenTS;
    private double dToan,dLy,dHoa,dUuTien;
    private double dXetTuyen;
 
    public void input(Scanner sc ){
        maTS = sc.nextLine();
        tenTS = sc.nextLine();
        dToan = Double.parseDouble(sc.nextLine());
        dLy =  Double.parseDouble(sc.nextLine());
        dHoa = Double.parseDouble(sc.nextLine());        
    }
    
    public double getdUuTien() {
        if(maTS.charAt(2)=='1') dUuTien=0.5;
        else if(maTS.charAt(2)=='2') dUuTien=1.0;
        else dUuTien=2.5;
        return dUuTien;
    }
    
    public double getdXetTuyen() {
        dXetTuyen = dToan*2+dLy + dHoa + getdUuTien();
        return dXetTuyen;
    }
    public String toStringDUuTien(){
        if(getdUuTien() == (int ) getdUuTien()) return Integer.toString((int ) getdUuTien());
        else return Double.toString((double ) getdUuTien());
    }
    public String toStringDXetTuyen(){
        if(getdXetTuyen() == (int) getdXetTuyen()) return Integer.toString((int ) getdXetTuyen());
        else return Double.toString((double ) getdXetTuyen());
    }
    public String getTenTS() {
        String s[]=tenTS.trim().toLowerCase().split("\\s+");
        String s1="";
        for(String i:s){
            s1+=i.substring(0, 1).toUpperCase()+i.substring(1) + " ";
        }
        return s1.trim();
    }
    @Override
    public String toString(){
        return maTS + " " + getTenTS() + " " + toStringDUuTien() + " " + toStringDXetTuyen()+" ";
    }
}
public class DanhSachTrungTuyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n= Integer.parseInt(sc.nextLine());
        List<ThiSinh> list = new ArrayList<>();
        while(n-->0){
            ThiSinh ts = new ThiSinh();
            ts.input(sc);
            list.add(ts);
        }
        int chiTieu = Integer.parseInt(sc.nextLine());
        list.sort(Comparator.comparing(ThiSinh::getdXetTuyen).reversed());
        double diemChuan=list.get(chiTieu-1).getdXetTuyen();
        System.out.println(diemChuan);
        for(ThiSinh i:list){
            if(i.getdXetTuyen() >= diemChuan){
                System.out.println(i+"TRUNG TUYEN");
            }
            else{
                System.out.println(i+"TRUOT");
            }
        }
    }
}
