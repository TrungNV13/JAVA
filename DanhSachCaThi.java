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
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author digit
 */
 class CaThi{
        static int id=1;
        private String ma,ngayThi,gioThi,phongThi;
        private long temp;
        
        public void input(Scanner sc ) throws ParseException{
            ma="C"+String.format("%03d", id++);
            ngayThi = sc.nextLine();
            gioThi = sc.nextLine();
            phongThi = sc.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            temp = sdf.parse(ngayThi).getTime()/1000;
        }

        public Long getTemp()  {
            long gio= Long.parseLong(gioThi.split(":")[0])*60*60;
            long giay= Long.parseLong(gioThi.split(":")[0])*60;
            return temp+gio+giay;
        }

        public String getMa() {
            return ma;
        }
        @Override
        public String toString(){
            return ma+" "+ngayThi+" "+gioThi+" "+phongThi;
        }
        
    }
public class DanhSachCaThi {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("CATHI.in"));
        List<CaThi> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            CaThi ct = new CaThi();
            ct.input(sc);
            list.add(ct);
        }
        list.sort(Comparator.comparing(CaThi::getTemp).thenComparing(CaThi::getMa));
        for(CaThi i:list){
            System.out.println(i);
        }
    }
}
