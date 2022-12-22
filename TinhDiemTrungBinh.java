/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author digit
 */
//class Students{
//    static int id=1;
//    private int rank;
//    private String name,code;
//    private double scores1,scores2,scores3,scoreMedium;
//    
//    public void input(Scanner sc ){
//        code = "SV" + String.format("%02d", id++);
//        name = sc.nextLine();
//        scores1= Double.parseDouble(sc.nextLine());
//        scores2= Double.parseDouble(sc.nextLine());
//        scores3= Double.parseDouble(sc.nextLine());
//        scoreMedium = (scores1*3+scores2*3+scores3*2)/8;
//    }
//
//    public String getScoreMedium() {
//        DecimalFormat dcf= new DecimalFormat("#.00");
//        return dcf.format(scoreMedium);
//    }
//    
//    public String getName() {
//        String s[] = name.trim().toLowerCase().split("\\s+");
//        String s1="";
//        for(String i:s){
//            s1+= i.substring(0,1).toUpperCase()+i.substring(1)+" ";
//        }
//        return s1.trim();
//    }
//    
//    public double compara(){
//        return scoreMedium;
//    }
//}
public class TinhDiemTrungBinh {
    static int id=1;
    private int rank;
    private String name,code;
    private int scores1,scores2,scores3;
    private float scoreMedium;
    
    public void input(Scanner sc ){
        code = "SV" + String.format("%02d", id++);
        name = sc.nextLine();
        scores1= Integer.parseInt(sc.nextLine());
        scores2= Integer.parseInt(sc.nextLine());
        scores3= Integer.parseInt(sc.nextLine());
        scoreMedium = (float)(scores1*3+scores2*3+scores3*2)/8;
    }

    public String getScoreMedium() {
        DecimalFormat dcf= new DecimalFormat("#.00");
        return dcf.format(scoreMedium);
    }
    
    public String getName() {
        String s[] = name.trim().toLowerCase().split("\\s+");
        String s1="";
        for(String i:s){
            s1+= i.substring(0,1).toUpperCase()+i.substring(1)+" ";
        }
        return s1.trim();
    }
    
    public float compara(){
        return scoreMedium;
    }
    @Override
    public String toString(){
        return code + " " + getName() + " ";
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n= Integer.parseInt(sc.nextLine());
        List<TinhDiemTrungBinh> list = new ArrayList<>();
        while(n-- > 0){
            TinhDiemTrungBinh stu = new TinhDiemTrungBinh();
            stu.input(sc);
            list.add(stu);           
        }
        int xephang=1;
        list.sort(Comparator.comparing(TinhDiemTrungBinh::compara).reversed());
        for(int i=0;i<list.size();i++){
            if(i==0){
                list.get(i).rank=xephang;
            }
            else{
                if(list.get(i).scoreMedium==list.get(i-1).scoreMedium){
                    list.get(i).rank=xephang;
                }
                else{
                    xephang=i+1;
                    list.get(i).rank=xephang;
                }
            }
        }
        for(TinhDiemTrungBinh i:list){
            System.out.print(i);
            System.out.printf("%.2f",i.scoreMedium);
            System.out.print(" "+ i.rank);
            System.out.println("");
        }
    }
}
//public class TinhDiemTrungBinh {
//    private String ten,ma;
//    private int diem1,diem2,diem3,xepHang;
//    private float diemTB;
//    public TinhDiemTrungBinh(String ten, int stt, int diem1, int diem2, int diem3) {
//        this.ten = ten;
//        this.ma = String.format("SV%02d",stt);
//        this.diem1 = diem1;
//        this.diem2 = diem2;
//        this.diem3 = diem3;
//    }
//    public float getDiemTB() {
//        return diemTB;
//    }
//    public String chuan_hoa_ten(){
//        ten=ten.trim().toLowerCase();
//        String s[]=ten.split("\\s+");
//        String s1="";
//        for (String i:s){
//            s1+=i.substring(0,1).toUpperCase()+i.substring(1)+" ";
//        }
//        return s1.trim();
//    }
//    public static void main(String[] args) {
//        File file=new File("src/code/BANGDIEM.in");
//        List<TinhDiemTrungBinh> l=new ArrayList<>();
//        try {
//            Scanner input=new Scanner(file);
//            while (input.hasNextLine()){
//                int n= input.nextInt();
//                input.nextLine();
//                for (int i=0;i<n;i++){
//                    int stt=i+1;
//                    String ten= input.nextLine();
//                    int diem1=Integer.parseInt(input.nextLine());
//                    int diem2=Integer.parseInt(input.nextLine());
//                    int diem3=Integer.parseInt(input.nextLine());
//                    l.add(new TinhDiemTrungBinh(ten,stt,diem1,diem2,diem3));
//                }
//                for (int i=0;i<n;i++){
//                    l.get(i).diemTB=(float) (l.get(i).diem1*3+l.get(i).diem2*3+l.get(i).diem3*2)/8;
//                }
//                l.sort(Comparator.comparing(TinhDiemTrungBinh::getDiemTB).reversed());
//                int rank=1;
//                for (int i=0;i<n-1;i++){
//                    if (l.get(i).diemTB==l.get(i+1).diemTB){
//                        l.get(i).xepHang=rank;
//                    }else {
//                        l.get(i).xepHang=rank;
//                        rank=i+2;
//                    }
//                }
//                l.get(l.size()-1).xepHang=rank;
//                for (TinhDiemTrungBinh i:l){
//                    System.out.print(i.ma+" "+i.chuan_hoa_ten()+" ");
//                    System.out.printf("%.2f ",i.diemTB);
//                    System.out.println(i.xepHang);
//                }
//            }
//            input.close();
//        }catch(IOException e){
//            System.out.println(e);
//        }
//    }
//}
