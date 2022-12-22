import java.text.DecimalFormat;
import java.util.Scanner;

public class KhaiBaoLopSinhVien {
    static class Students{
        private String ID_Student="B20DCCN001";
        private String Name;
        private String Class;
        private String birthday;
        private double point;
        public Students(){
            Name="";
            Class="";
            birthday="";
            point=0;
        }
        public void in(){
            Scanner sc = new Scanner(System.in);
            Name = sc.nextLine();
            Class = sc.nextLine();
            birthday = sc.nextLine();
            point =Double.parseDouble(sc.nextLine());
        }

        public String  getBirthday() {
            String s[] = birthday.split("/");
            String s1="";
            for(int i=0;i<s.length-1;i++){
                if(s[i].length()<2){
                    s1+="0"+s[i]+"/";
                }
                else {
                    s1+=s[i]+"/";
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
            return ID_Student +" "+ Name +" "+ Class+" "+ getBirthday()+" "+ getPoint();
        }
    }

    public static void main(String[] args) {
        Students sv = new Students();
        sv.in();
        System.out.println(sv);
    }
}
