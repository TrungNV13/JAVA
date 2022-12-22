/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author digit
 */
class students{
    static int id=1;
    private String student_code, name, birthday, classss;
    private double point;
    
    public void input(Scanner sc){
        if(id<10){
            student_code = "B20DCCN00";
        }
        else if(id<100){
            student_code = "B20DCCN0";
        }
        else{
            student_code = "B20DCCN";
        }
        student_code += Integer.toString(id++);
        name=sc.nextLine();
        classss = sc.nextLine();
        birthday = sc.nextLine();
        point = Double.parseDouble(sc.nextLine());
    }

    public String getBirthday() {
        String s[] = birthday.split("/");
        String s1="";
        for(int i=0;i<s.length -1;i++){
            if(s[i].length()<2){
                s1+= "0" + s[i] + "/";
            }
            else{
                s1+= s[i] + "/";
            }
        }
        s1+=s[s.length-1];
        return s1;
    }
    
    public String getPoint() {
        DecimalFormat a = new DecimalFormat("#.00");
        return a.format(point);
    }
    @Override
    public String toString(){
        return  student_code + " " + name + " " + classss + " " + getBirthday()+" " + getPoint();
    }
    
}
public class DanhSachSinhVienTrongFile2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SV.in"));
        int n= Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            students sv = new students();
            sv.input(sc);
            System.out.println(sv);         
        }
    }
}
