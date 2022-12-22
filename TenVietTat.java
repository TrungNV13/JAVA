/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author digit
 */
public class TenVietTat {
    static class HoTen{
        private String ten,vietTat;
        private int count=0;
        
        public void input(Scanner sc){
            ten = sc.nextLine();
        }
        
        public String getHo(){
            return ten.split("\\s+")[0];
        }
        public String getTen(){
            return ten.split("\\s+")[ten.length()-1];
        }
        
        @Override
        public String toString(){
            return ten;
        }
    }
    static class VietTat{
        private int count=0;
        private String vietTat;
        
        public void input(Scanner sc ){
            vietTat = sc.nextLine();
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        List<HoTen> listHoTen= new ArrayList<>();
        List<VietTat> listVietTat= new ArrayList<>();
        int n=Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            HoTen ht=new HoTen();
            ht.input(sc);
            listHoTen.add(ht);
        }
        int m= Integer.parseInt(sc.nextLine());
        while(m-- >0){
            VietTat vt=new VietTat();
            vt.input(sc);
            listVietTat.add(vt);
        }
        for(int i=0;i<listHoTen.size();i++){
            String s[]=listHoTen.get(i).ten.split("\\s+");
            String s1="";
            for(String x:s){
                s1+=x.substring(0,1)+".";
            }
            listHoTen.get(i).vietTat=s1.substring(0,s1.length()-1);
            String s2[]=listHoTen.get(i).vietTat.split("");
            for(String x:s2){
                if(x.compareTo(".")==0){
                    listHoTen.get(i).count++;
                }
            }
        }
        for(int i=0;i<listVietTat.size();i++){
            String s[]=listVietTat.get(i).vietTat.split("");
            for(String x:s){
                if(x.compareTo(".")==0){
                    listVietTat.get(i).count++;
                }
            }
        }
        
    }
}
/*
package Code_tren_codeptit.Vao_ra_file;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Ten_viet_tat {
    public static void main(String[] args) {
        File file=new File("DANHSACH.in");
        List<DS> lds=new ArrayList<>();
        List<vietTat> lvt=new ArrayList<>();
        try {
            Scanner input=new Scanner(file);
            while (input.hasNextLine()){
                int n= input.nextInt();
                input.nextLine();
                for (int i=0;i<n;i++){
                    String ten= input.nextLine();
                    lds.add(new DS(ten));
                }
                int m=Integer.parseInt(input.nextLine());
                for (int i=0;i<m;i++){
                    String vieTat= input.nextLine();
                    lvt.add(new vietTat(vieTat));
                }
            }
            input.close();
        }catch (IOException e){
            System.out.println(e);
        }
        for (int i=0;i<lds.size();i++){
            String s[]=lds.get(i).hoTen.split("\\s+");
            String s1="";
            for (String j:s){
                s1+=j.substring(0,1)+".";
            }
            lds.get(i).vietTat=s1.substring(0,s1.length()-1);
            String s2[]=lds.get(i).vietTat.split("");
            int dem=0;
            for (String j:s2){
                if (j.equals(".")){
                    dem++;
                }
            }
            lds.get(i).demCham=dem;
        }
        for (int i=0;i< lvt.size();i++){
            String s[]=lvt.get(i).vietT.split("");
            int dem=0;
            for (String j:s){
                if (j.equals(".")){
                    dem++;
                }
            }
            lvt.get(i).demCham=dem;
        }
        lds.sort(Comparator.comparing(DS::ten).thenComparing(DS::ho).thenComparing(DS::dem));
        for (int i=0;i<lvt.size();i++){
            for (int j=0;j<lds.size();j++){
                if (lds.get(j).vietTat.matches(lvt.get(i).vietT) && lds.get(j).demCham==lvt.get(i).demCham) {
                    System.out.println(lds.get(j).hoTen);
                }
            }
        }
    }
}
class DS{
    public String hoTen,vietTat;
    public int demCham;
    public DS(String hoTen) {
        this.hoTen = hoTen;
    }
    public String ten(){
        String s[]=hoTen.split("\\s+");
        return s[s.length-1];
    }
    public String ho(){
        String s[]=hoTen.split("\\s+");
        return s[0];
    }
    public String dem(){
        String s[]=hoTen.split("\\s+");
        String s1="";
        for (int i=1;i<s.length-1;i++){
            s1+=s[i]+" ";
        }
        return s1.trim();
    }
}
class vietTat{
    public String vietT;
    public int demCham;
    public vietTat(String vietT) {
        this.vietT = vietT;
    }
}
*/