import java.util.Scanner;

public class TinhThuNhapGiaoVien {
    static class Teacher{
        private String ID_Teacher;
        private String Name;
        private int Salary;
        public void in(){
            Scanner sc = new Scanner(System.in);
            ID_Teacher = sc.nextLine();
            Name = sc.nextLine();
            Salary = Integer.parseInt(sc.nextLine());
        }
        public int getLevel(){
            return Integer.parseInt(ID_Teacher.substring(2));
        }
        public int getAllowance(String s){
            if(s.substring(0,2).equals("HT")){
                return 2000000;
            }
            else if(s.substring(0,2).equals("HP")){
                return 900000;
            }
            else{
                return 500000;
            }
        }
        public int getSalary(){
            return getLevel()*Salary+getAllowance(ID_Teacher);

        }
        @Override
        public String toString(){
            return ID_Teacher + " " + Name + " " + getLevel() + " " + getAllowance(ID_Teacher) + " " + getSalary();
        }
    }

    public static void main(String[] args) {
        Teacher tc = new Teacher();
        tc.in();
        System.out.println(tc);
    }
}
